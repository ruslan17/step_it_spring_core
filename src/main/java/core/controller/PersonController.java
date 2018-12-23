package core.controller;

import core.model.Passport;
import core.model.Person;
import core.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonRepository repository;

    @GetMapping
    public List<Person> findAll() {
        return repository.findAll();
    }

}