package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsPermissionMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(CmsPermission record);

    int insertSelective(CmsPermission record);

    CmsPermission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(CmsPermission record);

    int updateByPrimaryKey(CmsPermission record);
}