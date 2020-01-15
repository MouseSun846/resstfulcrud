package com.example.resstfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloContronller  {

    @ResponseBody
    @RequestMapping("/hello")
    public String HelloWord(){
        return "hello!";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
            //classpath:/templates/
        map.put("hello","你好，我来自地球！！你来自哪里？？");
        map.put("users", Arrays.asList("zhangshan","lisi","wangwu"));
        return "success";
    }
    @RequestMapping("/wufu")
    public String sweepBless(){
        //五福响应界面
        return "picbless";
    }

    //引导页
    @RequestMapping({"/","/login.html"})
    public String index(){
        return "login";
    }

}
