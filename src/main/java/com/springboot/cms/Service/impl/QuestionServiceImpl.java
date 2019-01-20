package com.springboot.cms.Service.impl;

import com.springboot.cms.Service.QuestionService;
import com.springboot.cms.entity.Question;
import com.springboot.cms.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


        @Autowired
        private QuestionMapper questionMapper;

        @Override
        public List<Question> findAll() {
            return questionMapper.selectAll();
        }
    }

