package com.goochou.p2b.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goochou.p2b.model.AssessImgs;
import com.goochou.p2b.model.AssessImgsExample;

public interface AssessImgsMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	long countByExample(AssessImgsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int deleteByExample(AssessImgsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int insert(AssessImgs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int insertSelective(AssessImgs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	List<AssessImgs> selectByExample(AssessImgsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	AssessImgs selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int updateByExampleSelective(@Param("record") AssessImgs record, @Param("example") AssessImgsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int updateByExample(@Param("record") AssessImgs record, @Param("example") AssessImgsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int updateByPrimaryKeySelective(AssessImgs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table t_assess_imgs
	 *
	 * @mbg.generated Mon Jun 03 15:09:44 CST 2019
	 */
	int updateByPrimaryKey(AssessImgs record);

	// =======================================================================

/*	*//**
	 * 根据评价id获取相关的图片集合
	 * 
	 * @Title: listAssessImg
	 * @return List<AssessImgs>
	 * @author zj
	 * @date 2019-06-03 17:47
	 *//*
	List<AssessImgs> listAssessImg(Integer assessId);*/

	/**
	 * 获取 评价相关图片路径
	 * 
	 * @Title: listAssessImgPath
	 * @param assessId 评价主键
	 * @return List<Map<String,Object>>
	 * @author zj
	 * @date 2019-06-04 15:53
	 */
	List<AssessImgs> listAssessImgPath(Integer assessId);
}