package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsRolePer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsRolePerMapper {
    int deleteByPrimaryKey(Integer rolePermissionId);

    int insert(CmsRolePer record);

    int insertSelective(CmsRolePer record);

    CmsRolePer selectByPrimaryKey(Integer rolePermissionId);

    int updateByPrimaryKeySelective(CmsRolePer record);

    int updateByPrimaryKey(CmsRolePer record);
}