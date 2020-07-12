package mapper;

import bean.Keywords;
import bean.KeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordsMapper {
    int countByExample(KeywordsExample example);

    int deleteByExample(KeywordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Keywords record);

    int insertSelective(Keywords record);

    List<Keywords> selectByExample(KeywordsExample example);

    Keywords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    int updateByExample(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    int updateByPrimaryKeySelective(Keywords record);

    int updateByPrimaryKey(Keywords record);
}