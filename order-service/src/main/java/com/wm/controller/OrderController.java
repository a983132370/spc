package com.wm.controller;


import com.wm.api.UserServiceInter;
import com.wm.dto.TestPo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    UserServiceInter userServiceInter;

    @GetMapping("/getUserList")
    public List<String> getUserList(){
        return userServiceInter.getUserList();
    }
    @GetMapping("/testRest/{id}")
    public Map<String,Object> testRest(@PathVariable String id){
        return userServiceInter.testRest(id);
    }
    @GetMapping("/testParam")
    public Map<String,Object> testParam(String id){
        return userServiceInter.testParam(id);
    }
    @PostMapping("/testBody")
    public Map<String,Object> testBody(@RequestBody TestPo po){
        return userServiceInter.testBody(po);
    }
}
