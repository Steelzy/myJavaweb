package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsContentTxt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsContentTxtMapper {
    int deleteByPrimaryKey(Integer contentTxtId);

    int insert(CmsContentTxt record);

    int insertSelective(CmsContentTxt record);

    CmsContentTxt selectByPrimaryKey(Integer contentTxtId);

    int updateByPrimaryKeySelective(CmsContentTxt record);

    int updateByPrimaryKeyWithBLOBs(CmsContentTxt record);
}