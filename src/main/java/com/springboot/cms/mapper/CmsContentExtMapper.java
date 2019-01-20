package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsContentExt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsContentExtMapper {
    int deleteByPrimaryKey(Integer contentExtId);

    int insert(CmsContentExt record);

    int insertSelective(CmsContentExt record);

    CmsContentExt selectByPrimaryKey(Integer contentExtId);

    int updateByPrimaryKeySelective(CmsContentExt record);

    int updateByPrimaryKey(CmsContentExt record);
}