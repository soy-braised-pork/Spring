package com.example.archiecture.controller;

import com.example.archiecture.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
}
