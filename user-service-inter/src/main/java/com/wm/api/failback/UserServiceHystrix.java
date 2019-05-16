package com.wm.api.failback;

import com.wm.api.UserServiceInter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserServiceHystrix implements UserServiceInter{
    @Override
    public List<String> getUserList() {
        return new ArrayList<>();
    }
}
