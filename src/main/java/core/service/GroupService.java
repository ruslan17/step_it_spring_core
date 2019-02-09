package core.service;

import core.dao.GroupDAO;
import core.model.Group;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    private final GroupDAO dao;

    public GroupService(GroupDAO dao) {
        this.dao = dao;
    }

    public Group findById(Integer id) {
        return dao.findById(id);
    }

    public Group findById(Integer id, boolean isEager) {
        return dao.findById(id, isEager);
    }

}