package com.wm.api;

import com.wm.api.failback.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user-service",fallback = UserServiceHystrix.class)
public interface UserServiceInter {

    @GetMapping(value = "/user/getUserList")
    List<String> getUserList();

}
