package core.handler;

import core.exceptions.NoSuchUserException;
import core.model.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NoSuchUserException.class)
    public ErrorInfo noSuchUserExceptionHandler(HttpServletRequest request, NoSuchUserException exception) {
        String url = request.getRequestURL().toString();
        String message = exception.getLocalizedMessage();

        return ErrorInfo.builder()
                .url(url)
                .message(message)
                .build();
    }

}