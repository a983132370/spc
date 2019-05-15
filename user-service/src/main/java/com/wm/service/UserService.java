package com.wm.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    public List<String> getUserList() {
        List<String> userList = new ArrayList<>();
        userList.add("zhangsan");
        userList.add("lisi");
        userList.add("wangwu");
        return userList;
    }
}
