package com.wm.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user-service")
public interface UserServiceInter {

    @GetMapping(value = "/user/getUserList")
    List<String> getUserList();

}
