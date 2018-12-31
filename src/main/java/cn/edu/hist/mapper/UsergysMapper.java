package cn.edu.hist.mapper;

import cn.edu.hist.model.Usergys;
import cn.edu.hist.model.UsergysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsergysMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int countByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int deleteByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int insert(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int insertSelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    List<Usergys> selectByExampleWithBLOBs(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    List<Usergys> selectByExample(UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    Usergys selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Usergys record, @Param("example") UsergysExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Usergys record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usergys
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Usergys record);
}