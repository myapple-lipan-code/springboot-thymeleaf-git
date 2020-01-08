package com.ujiuye.service;

import com.ujiuye.po.User;

import java.util.List;

/**
 * @program: springboot-jpa-thymeleaf
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-07 22:24
 * CRUD操作
 **/
public interface UserService {
    public void add(User user);

    public void update(User user);

    public  void  delete(Long id);

    public User findOne(Long id);

    public List<User> findAll();


}
