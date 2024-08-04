package com.firstproject.springbootfirstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String firstHandler(){
        return "Hello World, This is just for testing";
    }

    @RequestMapping("/hello")
    public String secondHandler(){
        return "Hello User!!, This is also for demo.";
    }
}