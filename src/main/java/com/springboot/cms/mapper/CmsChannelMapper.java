package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsChannel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsChannelMapper {
    int deleteByPrimaryKey(Integer channelId);

    int insert(CmsChannel record);

    int insertSelective(CmsChannel record);

    CmsChannel selectByPrimaryKey(Integer channelId);

    int updateByPrimaryKeySelective(CmsChannel record);

    int updateByPrimaryKey(CmsChannel record);
}