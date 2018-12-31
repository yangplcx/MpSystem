package cn.edu.hist.mapper;

import cn.edu.hist.model.Yythdmx2014;
import cn.edu.hist.model.Yythdmx2014Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Yythdmx2014Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int countByExample(Yythdmx2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int deleteByExample(Yythdmx2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int insert(Yythdmx2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int insertSelective(Yythdmx2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    List<Yythdmx2014> selectByExample(Yythdmx2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    Yythdmx2014 selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Yythdmx2014 record, @Param("example") Yythdmx2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Yythdmx2014 record, @Param("example") Yythdmx2014Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Yythdmx2014 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yythdmx2014
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Yythdmx2014 record);
}