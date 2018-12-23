package core.controller;

import core.model.User;
import core.repository.UserRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

//    http://localhost:8484/users
    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

//    http://localhost:8484/users/{id}
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

//    http://localhost:8484/users/find?name={name}
    @GetMapping("/find")
    public List<User> findByName(@RequestParam String name) {
        return repository.findAllByName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @GetMapping("/find/{date}")
    public List<User> findByDateAfter(
            @PathVariable
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    LocalDate date) {
        return repository.findAllByBirthDateAfter(date);
    }

    @GetMapping("/find_by_age_desc")
    public List<User> findByAgeAndOrderDesc(@RequestParam int age) {
        return repository.findAllByAgeBiggerAndOrderDesc(age);
    }

    @GetMapping("/find_by_age")
    public List<User> findByAgeAndOrder(@RequestParam int age) {
        return repository.findAllByAgeBiggerAndOrderAsc(age);
    }

//    MUST BE IN SERVICE LAYER
    @GetMapping("/find_by")
    public List<User> findByAgeAndOrderDescOrAsc(
            @RequestParam int age,
            @RequestParam(required = false) String flag
            ) {
        if (flag == null) {
            return repository.findAllByAgeBiggerAndOrderAsc(age);
        } else {
            return repository.findAllByAgeBiggerAndOrderDesc(age);
        }
    }

}