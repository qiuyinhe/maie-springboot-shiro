package com.maielearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {


    @RequestMapping("/hello")
    public String handle01(){
        return "hello";
    }
}
