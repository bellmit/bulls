package com.goochou.p2b.dao;

import com.goochou.p2b.model.ProjectPayPlan;
import com.goochou.p2b.model.ProjectPayPlanExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ProjectPayPlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int countByExample(ProjectPayPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int deleteByExample(ProjectPayPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int insert(ProjectPayPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int insertSelective(ProjectPayPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    List<ProjectPayPlan> selectByExample(ProjectPayPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    ProjectPayPlan selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") ProjectPayPlan record, @Param("example") ProjectPayPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int updateByExample(@Param("record") ProjectPayPlan record, @Param("example") ProjectPayPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int updateByPrimaryKeySelective(ProjectPayPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_pay_plan
     *
     * @mbggenerated Mon Mar 20 13:46:31 CST 2017
     */
    int updateByPrimaryKey(ProjectPayPlan record);

    List<Map<String, Object>>  getProjectPayPlanByProjectId(Map<String, Object>  map);
}