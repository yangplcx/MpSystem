package cn.edu.hist.mapper;

import cn.edu.hist.model.Yycgdrk;
import cn.edu.hist.model.YycgdrkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YycgdrkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int countByExample(YycgdrkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int deleteByExample(YycgdrkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int insert(Yycgdrk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int insertSelective(Yycgdrk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    List<Yycgdrk> selectByExample(YycgdrkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    Yycgdrk selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Yycgdrk record, @Param("example") YycgdrkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Yycgdrk record, @Param("example") YycgdrkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Yycgdrk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Yycgdrk record);
}