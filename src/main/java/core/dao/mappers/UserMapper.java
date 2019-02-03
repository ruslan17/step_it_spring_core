package core.dao.mappers;

import core.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

//    @Select("select id, name, username," +
//            " email, birth_date from users WHERE id=#{id}")
    User findById(Integer id);

    void save(User user);
}