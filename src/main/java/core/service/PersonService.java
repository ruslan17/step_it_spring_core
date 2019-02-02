package core.service;

import core.annotations.Logged;
import core.exceptions.NoSuchUserException;
import core.model.Person;
import core.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    @Logged
    public Person findById(Integer id) {
        Optional<Person> personOptional = repository.findById(id);
        if (personOptional.isPresent()) {
            return personOptional.get();
        } throw new NoSuchUserException("No such user!");

    }




}
