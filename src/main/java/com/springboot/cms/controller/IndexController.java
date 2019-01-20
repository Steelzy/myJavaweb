package com.springboot.cms.controller;

import cn.hutool.core.util.ObjectUtil;
import com.springboot.cms.Service.CmsUserService;
import com.springboot.cms.entity.CmsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private CmsUserService cmsUserService;

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        CmsUser user = new CmsUser();
        user = cmsUserService.login(username,password);
        if(ObjectUtil.isNull(user)){
            return "a/404";
        }else{
            return "index_new";
        }
    }

}
