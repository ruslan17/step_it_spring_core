package core.service;

import core.dto.PersonDto;
import core.model.Person;
import core.repository.PersonFullNameProjection;
import core.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }


    public List<Person> findAll() {
        return repository.findAll();
    }

    public List<PersonFullNameProjection> findAllByLastName(String lastName) {
        return repository.findAllByLastName(lastName);
    }

    public PersonDto findPerson(Integer id) {
        Optional<Person> personOptional = repository.findById(id);

        if (personOptional.isPresent()) {
            Person person = personOptional.get();

            return PersonDto.builder()
                    .id(person.getId())
                    .fullName(person.getFirstName()
                            .concat(" ")
                            .concat(person.getLastName()))
                    .build();
        } else {
            throw new RuntimeException("No such user");
        }
    }
}
