package com.goochou.p2b.dao;

import com.goochou.p2b.model.Capital;
import com.goochou.p2b.model.CapitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int countByExample(CapitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int deleteByExample(CapitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int insert(Capital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int insertSelective(Capital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    List<Capital> selectByExample(CapitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    Capital selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") Capital record, @Param("example") CapitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int updateByExample(@Param("record") Capital record, @Param("example") CapitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int updateByPrimaryKeySelective(Capital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital
     *
     * @mbggenerated Mon Jan 26 14:43:27 CST 2015
     */
    int updateByPrimaryKey(Capital record);
}