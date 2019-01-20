package com.springboot.cms.mapper;

import com.springboot.cms.entity.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface QuestionMapper {


        List<Question> selectAll();

}
