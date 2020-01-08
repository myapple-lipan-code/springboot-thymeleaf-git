package com.ujiuye.dao;

import com.ujiuye.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot-jpa-thymeleaf
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-07 22:23
 **/
public interface UserDao extends JpaRepository<User,Long> {
}
