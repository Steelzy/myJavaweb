package com.springboot.cms.Service.impl;

import com.springboot.cms.Service.CmsLinkService;
import com.springboot.cms.entity.CmsLink;
import com.springboot.cms.mapper.CmsLinkMapper;
import com.springboot.cms.mapper.CmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmsLinkServiceImpl  implements CmsLinkService {

    @Autowired
    private CmsLinkMapper cmsLinkMapper;

    @Override
    public List<CmsLink> findAll() {
        return cmsLinkMapper.selectAll();
    }
}
