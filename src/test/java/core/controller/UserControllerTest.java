package core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import core.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

//@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void findById() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User actualUser = restTemplate.getForObject("/users/1", User.class);
        User expectedUser = User.builder()
                .id(1)
                .name("John")
                .username("john777")
                .birthDate(
                        LocalDate.of(1990, Month.OCTOBER, 10))
                .email("john@gmail.com")
                .role("ROLE_USER")
                .build();

        String actual = mapper.writeValueAsString(actualUser);
        String expected = mapper.writeValueAsString(expectedUser);

        System.out.println(actual);
        System.out.println(expected);

        assertEquals(expected, actual);
    }

}