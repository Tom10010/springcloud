package com.zht.logback.mapper;

import com.github.pagehelper.Page;
import com.zht.logback.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserDao {

    List<User> findByName(@Param(value = "username") String username);

    Page<User> getUserByPage();

}
