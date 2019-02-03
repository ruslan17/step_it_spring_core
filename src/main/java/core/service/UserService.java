package core.service;

import core.dao.UserDAO;
import core.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public User findById(Integer id) {
        return dao.findById(id);
    }

    public void save(User user) {
        dao.save(user);
    }
}
