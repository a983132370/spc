package com.wm.api.failback;

import com.wm.api.UserServiceInter;
import com.wm.dto.TestPo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserServiceHystrix implements UserServiceInter{
    @Override
    public List<String> getUserList() {
        return new ArrayList<>();
    }

    @Override
    public Map<String, Object> testRest(String id) {
        return new HashMap<>();
    }

    @Override
    public Map<String, Object> testParam(String id) {
        return new HashMap<>();
    }

    @Override
    public Map<String, Object> testBody(TestPo po) {
        return new HashMap<>();
    }
}
