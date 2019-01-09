package com.zht.logback.controller;

//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zht.logback.common.util.JsonUtil;
import com.zht.logback.entity.User;
import com.zht.logback.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/hello")
public class HelloController{

    @Autowired
    UserService userService;

    Gson gson = new GsonBuilder().create();

    @PostMapping("/hi")
    public String hi(@RequestBody User user){
        String json = gson.toJson(userService.findByUsername(user.getUsername()));
        log.info(">>>>>>>>>>>>{}", json);

        String json2 = JsonUtil.obj2String(userService.findByUsername(user.getUsername()));
        return json2;
    }

}
