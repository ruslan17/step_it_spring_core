package core.dao.mappers;

import core.model.Group;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {

    Group findById(Integer id);

    Group findByIdWithLazyInit(
            @Param("id") Integer id,
            @Param("isEager") boolean isEager);

}