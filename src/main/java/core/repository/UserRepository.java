package core.repository;

import core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

//    SELECT * FROM users WHERE name = ?
    List<User> findAllByName(String name);

    List<User> findAllByBirthDateAfter(LocalDate date);

    @Query("SELECT u FROM User u WHERE age > :age ORDER BY age DESC")
    List<User> findAllByAgeBiggerAndOrderDesc(@Param("age") int age);

    @Query(value = "SELECT * FROM users WHERE age > ?1 ORDER BY age",
            nativeQuery = true)
    List<User> findAllByAgeBiggerAndOrderAsc(int age);

}