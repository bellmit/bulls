package com.goochou.p2b.dao;

import com.goochou.p2b.model.ProjectActivitySetting;
import com.goochou.p2b.model.ProjectActivitySettingExample;
import com.goochou.p2b.model.User;
import com.goochou.p2b.model.vo.ProjectActivityRecordVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

import com.goochou.p2b.model.vo.ProjectActivitySettingVO;

public interface ProjectActivitySettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int countByExample(ProjectActivitySettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int deleteByExample(ProjectActivitySettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int insert(ProjectActivitySetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int insertSelective(ProjectActivitySetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    List<ProjectActivitySetting> selectByExample(ProjectActivitySettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    ProjectActivitySetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProjectActivitySetting record, @Param("example") ProjectActivitySettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProjectActivitySetting record, @Param("example") ProjectActivitySettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProjectActivitySetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_setting
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProjectActivitySetting record);
    
    int createProjectActivityRecordTable(Map<String, Object> params);
    
    int insertProjectActivityRecordBatch(Map<String, Object> record);
    
    int dropProjectActivityRecordTable(Map<String, Object> params);

    /**
     * 根据期数查询幸运号码列表
     * @param period 查询条件期数
     * @return List
     */
    List<ProjectActivitySettingVO> findProjectActivitySettingById(@Param("period") Integer period,
                                                                  @Param("limitStart") Integer limitStart,
                                                                  @Param("limitEnd") Integer limitEnd);

    /**
     * 根据期数查询幸运号码列表条数
     * @param period 查询条件期数
     * @return Integer
     */
    Integer queryProjectActivityRecordCountForAdmin(@Param("period") Integer period);

    /**
     * 查询活动页的详情
     * @param map
     * @return
     */
    List<Map<String,Object>> queryProjectAndActivity(Map<String, Object> map);

    /**
     * 查询每期活动的详情
     * @param map
     * @return
     */
    Map<String,Object> queryProjectActivityRecordX(Map<String, Object> map);

    /**
     * 查询幸运号详情
     * @param map
     * @return
     */
    List<Map<String,Object>> queryWinNumberDetailX(Map<String, Object> map);

    List<User> selectProjectActivityRecordUserInfo(Map<String, Object> params);

    List<ProjectActivityRecordVO> selectProjectActivityRecordWithUserInfo(Map<String, Object> params);

    Integer queryProjectActivityDetailCount(Map<String, Object> params);
    
    List<ProjectActivityRecordVO> queryProjectActivityByUser(Map<String, Object> params);
}