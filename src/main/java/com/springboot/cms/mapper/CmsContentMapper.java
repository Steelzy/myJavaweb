package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsContent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsContentMapper {
    int deleteByPrimaryKey(Integer contentId);

    int insert(CmsContent record);

    int insertSelective(CmsContent record);

    CmsContent selectByPrimaryKey(Integer contentId);

    int updateByPrimaryKeySelective(CmsContent record);

    int updateByPrimaryKey(CmsContent record);
}