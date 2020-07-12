package mapper;

import bean.Scopes;
import bean.ScopesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScopesMapper {
    int countByExample(ScopesExample example);

    int deleteByExample(ScopesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scopes record);

    int insertSelective(Scopes record);

    List<Scopes> selectByExample(ScopesExample example);

    Scopes selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scopes record, @Param("example") ScopesExample example);

    int updateByExample(@Param("record") Scopes record, @Param("example") ScopesExample example);

    int updateByPrimaryKeySelective(Scopes record);

    int updateByPrimaryKey(Scopes record);
}