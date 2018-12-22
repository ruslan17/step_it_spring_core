package core.controller;

import core.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
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

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public void save(@RequestBody User user) {
        System.out.println(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "John", 25),
                new User(2, "Dan", 27));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        System.out.println("User with id " + id + "" +
                " has been deleted.");
    }

//    localhost:8080/users?name=John
    @GetMapping("/find")
    public List<User> findByUserName(
            @RequestParam(required = false,
            defaultValue = "John") String name) {
        System.out.println(" Name is " + name);
        return null;
    }

}