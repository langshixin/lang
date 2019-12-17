package com.dream.langservice1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LSX
 * @version 1.0
 * @date 2019/12/12 15:59
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "hhh";
    }
    @RequestMapping(value = "/index2",method = RequestMethod.GET)
    public String index2(@RequestParam("id")String id){
        return "hhh"+id;
    }

}
