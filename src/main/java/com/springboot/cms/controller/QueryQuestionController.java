package com.springboot.cms.controller;

import com.springboot.cms.Service.CmsLinkService;
import com.springboot.cms.Service.QuestionService;
import com.springboot.cms.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/queryques")
public class QueryQuestionController {

    @Autowired
    private QuestionService questionService;

    @ResponseBody
    @RequestMapping("/quesresult")
    public List<Question> findAll(){
        System.out.println("Check is done!!!");
        List<Question> questionList=questionService.findAll();
       return questionList;
    }




}
