package mapper;

import bean.TurnDepartment;
import bean.TurnDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TurnDepartmentMapper {
    int countByExample(TurnDepartmentExample example);

    int deleteByExample(TurnDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TurnDepartment record);

    int insertSelective(TurnDepartment record);

    List<TurnDepartment> selectByExample(TurnDepartmentExample example);

    TurnDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TurnDepartment record, @Param("example") TurnDepartmentExample example);

    int updateByExample(@Param("record") TurnDepartment record, @Param("example") TurnDepartmentExample example);

    int updateByPrimaryKeySelective(TurnDepartment record);

    int updateByPrimaryKey(TurnDepartment record);
}