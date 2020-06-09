package com.hc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HC on 2018/4/24.
 */
@RestController
public class IndexController {

    @Value("${env}")
    private String env;

    @ResponseBody
    @RequestMapping("/index")
    public void index(){
        System.out.println(env);
    }

}
