package core.controller;

import core.model.ErrorInfo;
import core.model.Person;
import core.repository.PersonRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/persons")
@Api(value = "Person controller", description = "desc ...")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Person> findAll() {
        return repository.findAll();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200,
                    message = "Success",
            response = Person.class),
            @ApiResponse(code = 400,
            message = "Bad Request",
            response = ErrorInfo.class)
    })
    @ApiOperation(value = "Контроллер " +
            "возвращающий список юзеров по имени",
            notes = "доп инфа")
    @GetMapping("/find")
    public List<Person> findByName(@RequestParam String name) {
        List<Person> persons = repository.findAllByName(name);
        if (!persons.isEmpty()) {
            return persons;
        } throw new IllegalArgumentException("No such users");

    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable Integer id) {
        return repository.findById(id).get();
    }

    @PostMapping("/save")
    public void save(@RequestBody Person person) {
        repository.save(person);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public ErrorInfo noSuchUserExceptionHandler(HttpServletRequest request,
                                                IllegalArgumentException exception) {
        String url = request.getRequestURL().toString();
        String message = exception.getLocalizedMessage();

        return ErrorInfo.builder()
                .url(url)
                .message(message)
                .build();
    }

}