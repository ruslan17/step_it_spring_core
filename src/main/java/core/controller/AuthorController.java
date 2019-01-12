package core.controller;

import core.model.Author;
import core.model.Book;
import core.repository.AuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository repository;

    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Author> findAll() {
        return repository.findAll();
    }

}