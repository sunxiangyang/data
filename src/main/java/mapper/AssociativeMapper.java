package mapper;

import bean.Associative;
import bean.AssociativeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociativeMapper {
    int countByExample(AssociativeExample example);

    int deleteByExample(AssociativeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Associative record);

    int insertSelective(Associative record);

    List<Associative> selectByExample(AssociativeExample example);

    Associative selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Associative record, @Param("example") AssociativeExample example);

    int updateByExample(@Param("record") Associative record, @Param("example") AssociativeExample example);

    int updateByPrimaryKeySelective(Associative record);

    int updateByPrimaryKey(Associative record);
}