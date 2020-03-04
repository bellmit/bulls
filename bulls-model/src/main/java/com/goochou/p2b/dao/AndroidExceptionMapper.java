package com.goochou.p2b.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goochou.p2b.model.AndroidException;
import com.goochou.p2b.model.AndroidExceptionExample;

public interface AndroidExceptionMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int countByExample(AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int deleteByExample(AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int insert(AndroidException record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int insertSelective(AndroidException record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    List<AndroidException> selectByExampleWithBLOBs(AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    List<AndroidException> selectByExample(AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    AndroidException selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByExampleSelective(@Param("record") AndroidException record, @Param("example") AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") AndroidException record, @Param("example") AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByExample(@Param("record") AndroidException record, @Param("example") AndroidExceptionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByPrimaryKeySelective(AndroidException record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(AndroidException record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table android_exception
     *
     * @mbggenerated Wed Jun 03 16:37:37 CST 2015
     */
    int updateByPrimaryKey(AndroidException record);

    List<AndroidException> selectAndroidException(@Param("start") Integer start, @Param("limit") Integer limit);
}