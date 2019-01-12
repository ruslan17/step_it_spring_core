//package core.controller;
//
//import core.dto.PersonDto;
//import core.model.Person;
//import core.repository.PersonFullNameProjection;
//import core.repository.PersonRepository;
//import core.service.PersonService;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/persons")
//public class PersonController {
//
//    @Value("${step_it.value}")
//    private String value;
//
//    private final PersonService service;
//
//    public PersonController(PersonService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public List<Person> findAll() {
//        System.out.println(value);
//        return service.findAll();
//    }
//
//    @GetMapping("/{lastName}")
//    public List<PersonFullNameProjection> getFullNames(@PathVariable String lastName) {
//        return service.findAllByLastName(lastName);
//    }
//
//    @GetMapping("/dto/{id}")
//    public PersonDto getPerson(@PathVariable Integer id) {
//        return service.findPerson(id);
//    }
//
//}