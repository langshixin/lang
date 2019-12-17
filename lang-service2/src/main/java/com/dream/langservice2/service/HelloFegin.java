package com.dream.langservice2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LSX
 * @version 1.0
 * @date 2019/12/13 10:25
 */
@FeignClient(name = "langService1")
public interface HelloFegin {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
     String index();

    @RequestMapping(value = "/index2",method = RequestMethod.GET)
     String index2(@RequestParam("id")String id);
}
