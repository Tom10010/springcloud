package com.zht.logback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zht.logback.common.ServerResponse;
import com.zht.logback.mapper.UserDao;
//import com.zht.logback.common.ServerResponse;
import com.zht.logback.entity.User;
import com.zht.logback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findByUsername(String username) {
        return userDao.findByName(username);
    }

    @Override
    public Page<User> getUserByPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return userDao.getUserByPage();
    }


}