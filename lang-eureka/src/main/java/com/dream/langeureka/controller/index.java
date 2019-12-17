package com.dream.langeureka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LSX
 * @version 1.0
 * @date 2019/12/11 17:40
 */
@RestController
public class index {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "hhh";
    }
}
