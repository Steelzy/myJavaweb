package com.springboot.cms.Service.impl;

import com.springboot.cms.Service.CmsUserService;
import com.springboot.cms.entity.CmsUser;
import com.springboot.cms.mapper.CmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsUserServiceImpl implements CmsUserService {
    @Autowired
    private CmsUserMapper cmsUserMapper;

    @Override
    public CmsUser login(String userName, String password){
        CmsUser u = new CmsUser();
        u.setUsername(userName);
        u.setPassword(password);
        return cmsUserMapper.login(u);
    }
}
