package com.wm.api;

import com.wm.api.failback.UserServiceHystrix;
import com.wm.dto.TestPo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(value = "user-service",fallback = UserServiceHystrix.class)
public interface UserServiceInter {

    @GetMapping(value = "/user/getUserList")
    List<String> getUserList();
    @GetMapping(value = "/user/testRest/{id}")
    Map<String,Object> testRest(@PathVariable(value = "id") String id);
    @GetMapping(value = "/user/testParam")
    Map<String,Object> testParam(@RequestParam(value = "id") String id);
    @PostMapping(value = "/user/testBody",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Map<String,Object> testBody(TestPo testPo);
}
