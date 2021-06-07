package com.zlx.easy.annocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Company {

    @Autowired
    private UserServiceImpl userService;

    public void getUserName() {
        userService.printName();
    }
}
