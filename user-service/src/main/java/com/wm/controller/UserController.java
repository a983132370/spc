package com.wm.controller;

import com.wm.api.UserServiceInter;
import com.wm.dto.TestPo;
import com.wm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
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

    @GetMapping("/testRest/{id}")
    public Map<String,Object> testRest(@PathVariable String id){
        Map<String,Object> result = new HashMap<>();
        result.put("id",id);
        return result;
    }
    @GetMapping("/testParam")
    public Map<String,Object> testParam(String id){
        Map<String,Object> result = new HashMap<>();
        result.put("id",id);
        return result;
    }
    @PostMapping(value = "/testBody")
    public Map<String,Object> testBody(@RequestBody TestPo po){
        Map<String,Object> result = new HashMap<>();
        result.put("po",po);
        return result;
    }



}
