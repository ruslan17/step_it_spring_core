package core.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    private Integer id;

    private String name;

    private String username;

    private String email;

    private LocalDate birthDate;

    private String role;

}
