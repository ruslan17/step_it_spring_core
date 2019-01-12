package core.repository;

import core.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Person.class)

public interface PersonFullNameProjection {

//    String getFirstName();
//
//    String getLastName();
//
//    default String getFullName() {
//        return getFirstName().concat(" ").concat(getLastName());
//    }

    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullNameUsingSpEL();

}