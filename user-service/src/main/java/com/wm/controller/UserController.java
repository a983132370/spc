package com.wm.controller;

import com.wm.api.UserServiceInter;
import com.wm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController implements UserServiceInter {
    @Autowired
    UserService userService;

    @GetMapping("/getUserList")
    public List<String> getUserList(){
        return userService.getUserList();
    }

    @Value("${user.name}")
    private String userName;

    @GetMapping("/getName")
    public String getName(){
        return userName;
    }



}
