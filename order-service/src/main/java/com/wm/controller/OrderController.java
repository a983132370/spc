package com.wm.controller;


import com.wm.api.UserServiceInter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    UserServiceInter userServiceInter;

    @GetMapping("/getUserList")
    public List<String> getUserList(){
        return userServiceInter.getUserList();
    }
}
