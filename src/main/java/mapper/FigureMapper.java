package mapper;

import bean.Figure;
import bean.FigureExample;
import bean.FigureWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FigureMapper {
    int countByExample(FigureExample example);

    int deleteByExample(FigureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FigureWithBLOBs record);

    int insertSelective(FigureWithBLOBs record);

    List<FigureWithBLOBs> selectByExampleWithBLOBs(FigureExample example);

    List<Figure> selectByExample(FigureExample example);

    FigureWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FigureWithBLOBs record, @Param("example") FigureExample example);

    int updateByExampleWithBLOBs(@Param("record") FigureWithBLOBs record, @Param("example") FigureExample example);

    int updateByExample(@Param("record") Figure record, @Param("example") FigureExample example);

    int updateByPrimaryKeySelective(FigureWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FigureWithBLOBs record);

    int updateByPrimaryKey(Figure record);
}