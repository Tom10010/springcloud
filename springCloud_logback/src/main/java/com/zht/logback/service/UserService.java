package com.zht.logback.service;

import com.github.pagehelper.Page;
//import com.zht.logback.common.ServerResponse;
import com.zht.logback.common.ServerResponse;
import com.zht.logback.entity.User;

import java.util.List;

public interface UserService {

    List<User> findByUsername(String username);

    Page<User> getUserByPage(Integer pageNo, Integer pageSize);

}