package core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * AOP:
     *
     * Aspect
     * Pointcut - шаблон
     * Join point - конкретное место
     * Advice - код аспекта
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}