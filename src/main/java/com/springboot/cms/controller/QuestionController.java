package com.springboot.cms.controller;

import com.springboot.cms.entity.CmsUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/question")
@Controller
public class QuestionController {

    @RequestMapping("/model")
    public String jump(){

        return "question";
    }
}
