package core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@ToString
public class Group {

    private Integer id;

    private String name;

    private String description;

    private Set<Provider> providers;

}