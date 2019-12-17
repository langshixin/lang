package com.dream.langservice2.controller;

import com.dream.langservice2.service.HelloFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LSX
 * @version 1.0
 * @date 2019/12/13 10:23
 */
@RestController
public class homeController {

    @Autowired
    private HelloFegin client;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return client.index();
    }

    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index2(String id){
        return client.index2(id);
    }

}
