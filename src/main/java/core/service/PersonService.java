package core.service;

import core.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository repository;

    private final EmailService emailService;

    public PersonService(PersonRepository repository,
                         EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void send() {
        emailService.send("movsum.nigar@gmail.com",
                "Spring test",
                "Hello");
    }

}