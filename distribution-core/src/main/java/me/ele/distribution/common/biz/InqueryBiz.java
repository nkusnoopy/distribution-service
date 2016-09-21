package me.ele.distribution.common.biz;

import me.ele.distribution.common.dao.InqueryDao;
import me.ele.distribution.common.redis.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guoxin on 23/8/2016.
 */
@Service
public class InqueryBiz {

    @Autowired
    private InqueryDao inqueryDao;

    @Autowired
    private RedisClient  redisClient;

    public String queryPrice(){
        return inqueryDao.getPrice().toString()  +  redisClient.get("dist");
    }

}
