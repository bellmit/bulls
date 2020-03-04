package com.goochou.p2b.dao;

import com.goochou.p2b.model.EmployUser;
import com.goochou.p2b.model.EmployUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	long countByExample(EmployUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int deleteByExample(EmployUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int insert(EmployUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int insertSelective(EmployUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	List<EmployUser> selectByExample(EmployUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	EmployUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") EmployUser record, @Param("example") EmployUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") EmployUser record, @Param("example") EmployUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(EmployUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table employ_user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(EmployUser record);
	
	int insertByUserIds(@Param("userIds")List<Integer> userIds, @Param("empId")Integer empId);
	
	int updateUserDepartmentByEmployId(@Param("empId")Integer empId);
}