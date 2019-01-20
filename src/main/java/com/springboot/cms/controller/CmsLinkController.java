package com.springboot.cms.controller;

import com.springboot.cms.Service.CmsLinkService;
import com.springboot.cms.entity.CmsLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

    @Controller
    @RequestMapping("/link")
    public class CmsLinkController {
        @Autowired
        private CmsLinkService cmsLinkService;

        @ResponseBody
        @RequestMapping("/findAll")
        public List<CmsLink> findAll(){
            System.out.println("Check is done!!!");
            List<CmsLink> cls =  cmsLinkService.findAll();
            return cls;
        }

    @RequestMapping("/showAdd")
    public String showAdd(){
       return "/a/addLink";
    }

        @RequestMapping("/showhome")
        public String ShowHome(){
            return "question";
        }



        @RequestMapping("/showh")
        public String ShowH(){
            return "home";
        }

        @RequestMapping("/showindex")
        public String ShowIndex(){
            return "index_new";
        }

        @RequestMapping("/goanswer")
        public String GoAnswer(){
            return "question_select_index";


        }

        @RequestMapping("/contactus")
        public String Contact(){
            return "contactUs";
        }

}
