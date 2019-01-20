package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsVote;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsVoteMapper {
    int deleteByPrimaryKey(Integer voteId);

    int insert(CmsVote record);

    int insertSelective(CmsVote record);

    CmsVote selectByPrimaryKey(Integer voteId);

    int updateByPrimaryKeySelective(CmsVote record);

    int updateByPrimaryKey(CmsVote record);
}