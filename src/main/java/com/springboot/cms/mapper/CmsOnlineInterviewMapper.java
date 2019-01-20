package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsOnlineInterview;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsOnlineInterviewMapper {
    int deleteByPrimaryKey(Integer interviewId);

    int insert(CmsOnlineInterview record);

    int insertSelective(CmsOnlineInterview record);

    CmsOnlineInterview selectByPrimaryKey(Integer interviewId);

    int updateByPrimaryKeySelective(CmsOnlineInterview record);

    int updateByPrimaryKey(CmsOnlineInterview record);
}