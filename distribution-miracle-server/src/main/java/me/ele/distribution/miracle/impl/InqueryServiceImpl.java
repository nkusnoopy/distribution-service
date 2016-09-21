package me.ele.distribution.miracle.impl;

import me.ele.distribution.common.biz.InqueryBiz;
import me.ele.distribution.miracle.api.InqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by guoxin on 22/8/2016.
 */
@Service
public class InqueryServiceImpl implements InqueryService {

    @Autowired
    private InqueryBiz inquery;

    @Override
    public String queryPrice() {
        return inquery.queryPrice();
    }
}
