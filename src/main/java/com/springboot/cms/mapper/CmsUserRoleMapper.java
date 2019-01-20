package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsUserRoleMapper {
    int deleteByPrimaryKey(Integer userRoleId);

    int insert(CmsUserRole record);

    int insertSelective(CmsUserRole record);

    CmsUserRole selectByPrimaryKey(Integer userRoleId);

    int updateByPrimaryKeySelective(CmsUserRole record);

    int updateByPrimaryKey(CmsUserRole record);
}