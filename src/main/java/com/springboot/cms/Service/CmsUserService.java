package com.springboot.cms.Service;

import com.springboot.cms.entity.CmsUser;

public interface CmsUserService {

    CmsUser login(String userName,String password);
}