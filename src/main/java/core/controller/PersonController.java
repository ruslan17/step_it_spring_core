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


}