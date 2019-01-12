package core.repository;

import core.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}