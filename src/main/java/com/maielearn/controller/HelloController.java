package com.maielearn.controller;

import com.maielearn.mapper.UserMapper;
import com.maielearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String handle01() {
        System.out.println(userService.getById('1'));
        return "hello";
    }
}
