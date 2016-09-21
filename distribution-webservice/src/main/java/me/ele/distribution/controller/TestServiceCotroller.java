package me.ele.distribution.controller;

import me.ele.distribution.miracle.api.InqueryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.io.IOException;

/**
 * Created by guoxin on 22/8/2016.
 */
@Controller
@RequestMapping("/test")
public class TestServiceCotroller {


    private InqueryService inqueryService ;
    @PostConstruct
    public void init() throws IOException {
        inqueryService = ClientUtils.getClient(InqueryService.class);
    }



    @RequestMapping(value = "/QUERY", method = RequestMethod.GET)
    @ResponseBody
    public String query(){
        return inqueryService.queryPrice();
    }

}
