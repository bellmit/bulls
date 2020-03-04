package com.goochou.p2b.dao;

import com.goochou.p2b.model.Banner;
import com.goochou.p2b.model.BannerExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface BannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int countByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int deleteByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int insert(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int insertSelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    List<Banner> selectByExample(BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    Banner selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int updateByExampleSelective(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int updateByExample(@Param("record") Banner record, @Param("example") BannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int updateByPrimaryKeySelective(Banner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table banner
     *
     * @mbggenerated Tue Sep 06 11:09:13 CST 2016
     */
    int updateByPrimaryKey(Banner record);



    Banner detailBanner(Integer id);

    Integer getCountBanner(Map<String,Object> map);

    List<Banner> listBanner(Map<String,Object> map);
}