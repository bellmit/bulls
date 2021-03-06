package com.goochou.p2b.dao;

import com.goochou.p2b.model.AppVersion;
import com.goochou.p2b.model.AppVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int countByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int deleteByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int insert(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int insertSelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    List<AppVersion> selectByExample(AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    AppVersion selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int updateByExampleSelective(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int updateByExample(@Param("record") AppVersion record, @Param("example") AppVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int updateByPrimaryKeySelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated Tue Jul 21 09:20:32 CST 2015
     */
    int updateByPrimaryKey(AppVersion record);
}