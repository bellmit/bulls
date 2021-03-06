package com.goochou.p2b.dao;

import com.goochou.p2b.model.ProjectActivityLog;
import com.goochou.p2b.model.ProjectActivityLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ProjectActivityLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int countByExample(ProjectActivityLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int deleteByExample(ProjectActivityLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int insert(ProjectActivityLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int insertSelective(ProjectActivityLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    List<ProjectActivityLog> selectByExample(ProjectActivityLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    ProjectActivityLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ProjectActivityLog record, @Param("example") ProjectActivityLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ProjectActivityLog record, @Param("example") ProjectActivityLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ProjectActivityLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_activity_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ProjectActivityLog record);

    List<Map<String,Object>> queryActivityNumberList(Map<String ,Object> map);
}