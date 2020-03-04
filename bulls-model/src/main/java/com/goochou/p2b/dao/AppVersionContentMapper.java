package com.goochou.p2b.dao;

import com.goochou.p2b.model.AppVersionContent;
import com.goochou.p2b.model.AppVersionContentExample;
import com.goochou.p2b.model.AppVersionContentWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AppVersionContentMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	long countByExample(AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int deleteByExample(AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int insert(AppVersionContentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int insertSelective(AppVersionContentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	List<AppVersionContentWithBLOBs> selectByExampleWithBLOBs(AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	List<AppVersionContent> selectByExample(AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	AppVersionContentWithBLOBs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByExampleSelective(@Param("record") AppVersionContentWithBLOBs record,
			@Param("example") AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByExampleWithBLOBs(@Param("record") AppVersionContentWithBLOBs record,
			@Param("example") AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByExample(@Param("record") AppVersionContent record, @Param("example") AppVersionContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByPrimaryKeySelective(AppVersionContentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByPrimaryKeyWithBLOBs(AppVersionContentWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table app_version_content
	 * @mbg.generated  Fri May 10 13:36:10 CST 2019
	 */
	int updateByPrimaryKey(AppVersionContent record);

	AppVersionContent getAppVersionContent(@Param(value="client") String client);

	AppVersionContentWithBLOBs getAppVersionContentWithBLOBs(@Param(value="client") String client);

	List<AppVersionContent> queryAppVersionContentList(Map<String, Object> map);

	Integer queryAppVersionContentCount(String keyword);
}