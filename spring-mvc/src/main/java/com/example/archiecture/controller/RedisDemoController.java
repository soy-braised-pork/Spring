package com.example.archiecture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class RedisDemoController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


}
