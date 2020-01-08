package com.ujiuye.pay;

/**
 * @program: springboot-thymeleaf-git
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-08 20:16
 **/
public interface PayService {
    public  void add(Double money);
    public  void update(Double money);
    public  void delete(long id);
}
