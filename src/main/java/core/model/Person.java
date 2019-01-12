package core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Setter
@ToString
@Entity
@Table(name = "persons")
public class Person {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}