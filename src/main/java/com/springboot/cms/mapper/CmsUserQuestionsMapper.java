package com.springboot.cms.mapper;

import com.springboot.cms.entity.CmsUserQuestions;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CmsUserQuestionsMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(CmsUserQuestions record);

    int insertSelective(CmsUserQuestions record);

    CmsUserQuestions selectByPrimaryKey(Integer questionId);

    int updateByPrimaryKeySelective(CmsUserQuestions record);

    int updateByPrimaryKey(CmsUserQuestions record);
}