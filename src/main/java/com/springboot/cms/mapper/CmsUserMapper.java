package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsUserMapper {

    CmsUser login(CmsUser u);

    int deleteByPrimaryKey(Integer userId);

    int insert(CmsUser record);

    int insertSelective(CmsUser record);

    CmsUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(CmsUser record);

    int updateByPrimaryKey(CmsUser record);
}