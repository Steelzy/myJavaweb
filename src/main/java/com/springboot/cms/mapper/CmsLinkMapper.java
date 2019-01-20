package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CmsLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(CmsLink record);

    int insertSelective(CmsLink record);

    CmsLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(CmsLink record);

    int updateByPrimaryKey(CmsLink record);

    List<CmsLink> selectAll();
}