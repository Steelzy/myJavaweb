package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsDownload;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsDownloadMapper {
    int deleteByPrimaryKey(Integer fileId);

    int insert(CmsDownload record);

    int insertSelective(CmsDownload record);

    CmsDownload selectByPrimaryKey(Integer fileId);

    int updateByPrimaryKeySelective(CmsDownload record);

    int updateByPrimaryKey(CmsDownload record);
}