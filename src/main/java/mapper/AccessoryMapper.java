package mapper;

import bean.Accessory;
import bean.AccessoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessoryMapper {
    int countByExample(AccessoryExample example);

    int deleteByExample(AccessoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Accessory record);

    int insertSelective(Accessory record);

    List<Accessory> selectByExample(AccessoryExample example);

    Accessory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByExample(@Param("record") Accessory record, @Param("example") AccessoryExample example);

    int updateByPrimaryKeySelective(Accessory record);

    int updateByPrimaryKey(Accessory record);
}