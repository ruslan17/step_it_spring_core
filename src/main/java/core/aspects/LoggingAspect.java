package core.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    @Around("@annotation(core.annotations.Logged)")
    public Object logOutput(ProceedingJoinPoint joinPoint) throws Throwable {

        Long startTime = System.nanoTime();
        log.info("Enter to method time: "
                + LocalDateTime.now().toString());

        Object object = joinPoint.proceed();

        log.info("End of method time: "
                + LocalDateTime.now().toString());

        Long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        log.info("Execution time: " + duration);

        return object;
    }

}