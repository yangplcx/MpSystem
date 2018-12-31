package cn.edu.hist.mapper;

import cn.edu.hist.model.Ypxx;
import cn.edu.hist.model.YpxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YpxxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int countByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int deleteByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int insert(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int insertSelective(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    List<Ypxx> selectByExampleWithBLOBs(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    List<Ypxx> selectByExample(YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    Ypxx selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Ypxx record, @Param("example") YpxxExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Ypxx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ypxx
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ypxx record);
}