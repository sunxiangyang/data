package mapper;

import bean.EventType;
import bean.EventTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventTypeMapper {
    int countByExample(EventTypeExample example);

    int deleteByExample(EventTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EventType record);

    int insertSelective(EventType record);

    List<EventType> selectByExample(EventTypeExample example);

    EventType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EventType record, @Param("example") EventTypeExample example);

    int updateByExample(@Param("record") EventType record, @Param("example") EventTypeExample example);

    int updateByPrimaryKeySelective(EventType record);

    int updateByPrimaryKey(EventType record);
}