package mapper;

import bean.Cases;
import bean.CasesExample;
import bean.CasesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CasesMapper {
    int countByExample(CasesExample example);

    int deleteByExample(CasesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CasesWithBLOBs record);

    int insertSelective(CasesWithBLOBs record);

    List<CasesWithBLOBs> selectByExampleWithBLOBs(CasesExample example);

    List<Cases> selectByExample(CasesExample example);

    CasesWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CasesWithBLOBs record, @Param("example") CasesExample example);

    int updateByExampleWithBLOBs(@Param("record") CasesWithBLOBs record, @Param("example") CasesExample example);

    int updateByExample(@Param("record") Cases record, @Param("example") CasesExample example);

    int updateByPrimaryKeySelective(CasesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CasesWithBLOBs record);

    int updateByPrimaryKey(Cases record);
}