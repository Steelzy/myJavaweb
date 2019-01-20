package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsModule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsModuleMapper {
    int deleteByPrimaryKey(Integer moduleId);

    int insert(CmsModule record);

    int insertSelective(CmsModule record);

    CmsModule selectByPrimaryKey(Integer moduleId);

    int updateByPrimaryKeySelective(CmsModule record);

    int updateByPrimaryKey(CmsModule record);
}