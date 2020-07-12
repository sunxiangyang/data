package mapper;

import bean.Duty;
import bean.DutyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DutyMapper {
    int countByExample(DutyExample example);

    int deleteByExample(DutyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Duty record);

    int insertSelective(Duty record);

    List<Duty> selectByExample(DutyExample example);

    Duty selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByExample(@Param("record") Duty record, @Param("example") DutyExample example);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);
}