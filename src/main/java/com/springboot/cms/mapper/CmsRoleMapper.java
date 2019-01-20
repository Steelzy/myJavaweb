package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(CmsRole record);

    int insertSelective(CmsRole record);

    CmsRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(CmsRole record);

    int updateByPrimaryKey(CmsRole record);
}