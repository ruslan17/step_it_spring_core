package core.controller;

import core.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class RESTController {

//    "localhost:8080/users/get"
//    @GetMapping("/get")
//    public User getUser() {
//        return new User(1, "John", 25);
//    }

//    users/1
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        if (id == 1) {
            return new User(1, "John", 25);
        }
        return null;
    }

    @GetMapping
    public List<User> getUsers() {
        return null;
    }

}