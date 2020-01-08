package com.ujiuye.service;

import com.ujiuye.dao.UserDao;
import com.ujiuye.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @program: springboot-jpa-thymeleaf
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-07 22:27
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User findOne(Long id) {
        Optional<User> optionalUser = userDao.findById(id);
        if(optionalUser.isPresent()){
            return optionalUser.get();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
