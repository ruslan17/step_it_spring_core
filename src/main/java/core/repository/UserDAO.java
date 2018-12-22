package core.repository;

import core.model.User;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDAO {

    private final EntityManager entityManager;

    public UserDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<User> findAll() {
        List<User> users = entityManager.createNativeQuery(
                "SELECT * FROM users").getResultList();
        return users;
    }

    public User getUserById(Integer id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

}