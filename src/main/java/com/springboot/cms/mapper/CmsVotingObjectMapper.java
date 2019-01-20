package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsVotingObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsVotingObjectMapper {
    int deleteByPrimaryKey(Integer personId);

    int insert(CmsVotingObject record);

    int insertSelective(CmsVotingObject record);

    CmsVotingObject selectByPrimaryKey(Integer personId);

    int updateByPrimaryKeySelective(CmsVotingObject record);

    int updateByPrimaryKey(CmsVotingObject record);
}