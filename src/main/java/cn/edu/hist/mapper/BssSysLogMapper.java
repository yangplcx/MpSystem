package cn.edu.hist.mapper;

import cn.edu.hist.model.BssSysLog;
import cn.edu.hist.model.BssSysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BssSysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int countByExample(BssSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int deleteByExample(BssSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int insert(BssSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int insertSelective(BssSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    List<BssSysLog> selectByExample(BssSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    BssSysLog selectByPrimaryKey(String logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BssSysLog record, @Param("example") BssSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BssSysLog record, @Param("example") BssSysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BssSysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bss_sys_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BssSysLog record);
}