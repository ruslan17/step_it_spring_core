package core.controller;

import core.model.User;
import core.repository.UserDAO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class WebController {

    private final UserDAO dao;

    public WebController(UserDAO dao) {
        this.dao = dao;
    }

    @GetMapping
    public List<User> findAll() {
        return dao.findAll();
    }

}