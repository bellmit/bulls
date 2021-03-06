package com.goochou.p2b.dao;

import com.goochou.p2b.model.ActivityCouponRecord;
import com.goochou.p2b.model.ActivityCouponRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityCouponRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int countByExample(ActivityCouponRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int deleteByExample(ActivityCouponRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int insert(ActivityCouponRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int insertSelective(ActivityCouponRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    List<ActivityCouponRecord> selectByExample(ActivityCouponRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    ActivityCouponRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int updateByExampleSelective(@Param("record") ActivityCouponRecord record, @Param("example") ActivityCouponRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int updateByExample(@Param("record") ActivityCouponRecord record, @Param("example") ActivityCouponRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int updateByPrimaryKeySelective(ActivityCouponRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_coupon_record
     *
     * @mbggenerated Mon Dec 14 13:27:27 CST 2015
     */
    int updateByPrimaryKey(ActivityCouponRecord record);
}