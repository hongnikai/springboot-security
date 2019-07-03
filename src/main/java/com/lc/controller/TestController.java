package com.lc.controller;

import com.lc.service.UserService;
import com.lc.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;

@RestController
@RequestMapping("/testController")
@SuppressWarnings("all")
public class TestController {

    @Autowired
    private UserService userService;


    @Autowired
    private UserinfoService userinfoService;


    @RequestMapping("/test")
    public Object test(){
        return userService.selectAllUser();
    }

    @RequestMapping("/testData")
    public String testData(){
        return "sssss";
    }

}
