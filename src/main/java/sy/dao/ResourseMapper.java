package sy.dao;

import sy.model.Resourse;

public interface ResourseMapper {
    int deleteByPrimaryKey(String id);

    int insert(Resourse record);

    int insertSelective(Resourse record);

    Resourse selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Resourse record);

    int updateByPrimaryKey(Resourse record);
}