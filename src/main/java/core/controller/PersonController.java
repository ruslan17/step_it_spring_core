package core.controller;

import core.exceptions.NoSuchUserException;
import core.model.ErrorInfo;
import core.model.Person;
import core.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable Integer id) {
        return service.findById(id);
    }

//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler(NoSuchUserException.class)
//    public ErrorInfo noSuchUserExceptionHandler(HttpServletRequest request, NoSuchUserException exception) {
//        String url = request.getRequestURL().toString();
//        String message = exception.getLocalizedMessage();
//
//        return ErrorInfo.builder()
//                .url(url)
//                .message(message)
//                .build();
//    }

}