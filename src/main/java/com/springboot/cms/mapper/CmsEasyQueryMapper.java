package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsEasyQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsEasyQueryMapper {
    int deleteByPrimaryKey(Integer easyQueryId);

    int insert(CmsEasyQuery record);

    int insertSelective(CmsEasyQuery record);

    CmsEasyQuery selectByPrimaryKey(Integer easyQueryId);

    int updateByPrimaryKeySelective(CmsEasyQuery record);

    int updateByPrimaryKey(CmsEasyQuery record);
}