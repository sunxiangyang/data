package mapper;

import bean.FigureCategory;
import bean.FigureCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FigureCategoryMapper {
    int countByExample(FigureCategoryExample example);

    int deleteByExample(FigureCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FigureCategory record);

    int insertSelective(FigureCategory record);

    List<FigureCategory> selectByExample(FigureCategoryExample example);

    FigureCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FigureCategory record, @Param("example") FigureCategoryExample example);

    int updateByExample(@Param("record") FigureCategory record, @Param("example") FigureCategoryExample example);

    int updateByPrimaryKeySelective(FigureCategory record);

    int updateByPrimaryKey(FigureCategory record);
}