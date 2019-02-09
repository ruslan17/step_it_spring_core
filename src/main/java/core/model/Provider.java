package core.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Provider {

    private Integer id;

    private String name;

    private String description;

    private Group group;

}