package com.goochou.p2b.dao;

import com.goochou.p2b.model.AndroidTunnelManagement;
import com.goochou.p2b.model.AndroidTunnelManagementExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AndroidTunnelManagementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int countByExample(AndroidTunnelManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int deleteByExample(AndroidTunnelManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int insert(AndroidTunnelManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int insertSelective(AndroidTunnelManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    List<AndroidTunnelManagement> selectByExample(AndroidTunnelManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    AndroidTunnelManagement selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int updateByExampleSelective(@Param("record") AndroidTunnelManagement record, @Param("example") AndroidTunnelManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int updateByExample(@Param("record") AndroidTunnelManagement record, @Param("example") AndroidTunnelManagementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int updateByPrimaryKeySelective(AndroidTunnelManagement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table android_tunnel_management
     *
     * @mbggenerated Fri Mar 03 17:06:12 CST 2017
     */
    int updateByPrimaryKey(AndroidTunnelManagement record);

    public List<Map<String, Object>> queryAllPage(Map<String, Object> map);

    public List<Map<String, Object>> queryAll();

    public Map<String, Object> queryByCode(String code);

    public List<Map<String, Object>> queryByCompanyRoleId(Integer roleId);

    public Map<String, Object> queryById(Integer id);

}