package core.dao;

import core.dao.mappers.GroupMapper;
import core.model.Group;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDAO {

    private GroupMapper mapper;

    public GroupDAO(GroupMapper mapper) {
        this.mapper = mapper;
    }

    public Group findById(Integer id) {
        return mapper.findById(id);
    }

    public Group findById(Integer id, boolean isEager) {
        return mapper.findByIdWithLazyInit(id, isEager);
    }

}