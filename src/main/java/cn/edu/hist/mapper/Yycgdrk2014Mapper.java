package cn.edu.hist.mapper;

import cn.edu.hist.model.Yycgdrk2014;
import cn.edu.hist.model.Yycgdrk2014Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yycgdrk2014Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int countByExample(Yycgdrk2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int deleteByExample(Yycgdrk2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int insert(Yycgdrk2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int insertSelective(Yycgdrk2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    List<Yycgdrk2014> selectByExample(Yycgdrk2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    Yycgdrk2014 selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Yycgdrk2014 record, @Param("example") Yycgdrk2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Yycgdrk2014 record, @Param("example") Yycgdrk2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Yycgdrk2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yycgdrk2014
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Yycgdrk2014 record);
}