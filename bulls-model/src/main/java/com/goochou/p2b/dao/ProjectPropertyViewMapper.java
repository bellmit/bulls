package com.goochou.p2b.dao;

import com.goochou.p2b.model.ProjectPropertyView;
import com.goochou.p2b.model.ProjectPropertyViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectPropertyViewMapper {


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_property_view
     *
     * @mbggenerated
     */
    List<ProjectPropertyView> selectByExample(ProjectPropertyViewExample example);


}