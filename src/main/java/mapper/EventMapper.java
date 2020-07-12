package mapper;

import bean.Event;
import bean.EventExample;
import bean.EventWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper {
    int countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int deleteByPrimaryKey(String name);

    int insert(EventWithBLOBs record);

    int insertSelective(EventWithBLOBs record);

    List<EventWithBLOBs> selectByExampleWithBLOBs(EventExample example);

    List<Event> selectByExample(EventExample example);

    EventWithBLOBs selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExampleWithBLOBs(@Param("record") EventWithBLOBs record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);

    int updateByPrimaryKeySelective(EventWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

    int updateByPrimaryKey(Event record);
}