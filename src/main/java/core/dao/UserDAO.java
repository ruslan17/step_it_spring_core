package core.dao;

import core.dao.mappers.UserMapper;
import core.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    private UserMapper mapper;

    public UserDAO(UserMapper mapper) {
        this.mapper = mapper;
    }

    public User findById(Integer id) {
        return mapper.findById(id);
    }

    public void save(User user) {
        mapper.save(user);
    }
}