package mapper;

import bean.CaseType;
import bean.CaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaseTypeMapper {
    int countByExample(CaseTypeExample example);

    int deleteByExample(CaseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaseType record);

    int insertSelective(CaseType record);

    List<CaseType> selectByExample(CaseTypeExample example);

    CaseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaseType record, @Param("example") CaseTypeExample example);

    int updateByExample(@Param("record") CaseType record, @Param("example") CaseTypeExample example);

    int updateByPrimaryKeySelective(CaseType record);

    int updateByPrimaryKey(CaseType record);
}