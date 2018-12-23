package core.controller;

import core.model.Address;
import core.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/address")
public class AddressController {

    private final AddressRepository repository;

    @GetMapping
    public List<Address> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Address findById(@PathVariable Integer id) {
        Address address = repository.findById(id).get();
        System.out.println("---------------");
        address.getPersons()
                .forEach(person ->
                        System.out.println(person.getName()));
        return address;
    }

}