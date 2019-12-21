package com.zhaopeng.service.impl;

import com.zhaopeng.config.ConfigBean;
import com.zhaopeng.service.QueryConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class QueryConditionServiceImpl implements QueryConditionService {

    @Autowired
    private ConfigBean configBean;


    @Override
    public List<String> getCityList() throws IOException {
        return configBean.getCityList();
    }
}
