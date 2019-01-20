package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsConversation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsConversationMapper {
    int deleteByPrimaryKey(Integer conversationId);

    int insert(CmsConversation record);

    int insertSelective(CmsConversation record);

    CmsConversation selectByPrimaryKey(Integer conversationId);

    int updateByPrimaryKeySelective(CmsConversation record);

    int updateByPrimaryKey(CmsConversation record);
}