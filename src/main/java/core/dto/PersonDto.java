package core.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private Integer id;

    private String fullName;

}