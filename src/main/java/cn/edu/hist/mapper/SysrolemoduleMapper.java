package cn.edu.hist.mapper;

import cn.edu.hist.model.Sysrolemodule;
import cn.edu.hist.model.SysrolemoduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysrolemoduleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int countByExample(SysrolemoduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int deleteByExample(SysrolemoduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("roleid") String roleid, @Param("moduleid") String moduleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int insert(Sysrolemodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int insertSelective(Sysrolemodule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    List<Sysrolemodule> selectByExample(SysrolemoduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Sysrolemodule record, @Param("example") SysrolemoduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysrolemodule
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Sysrolemodule record, @Param("example") SysrolemoduleExample example);
}