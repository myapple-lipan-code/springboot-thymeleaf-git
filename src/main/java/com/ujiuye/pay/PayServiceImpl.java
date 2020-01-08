package com.ujiuye.pay;

/**
 * @program: springboot-thymeleaf-git
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-08 20:17
 **/
public class PayServiceImpl implements PayService {
    @Override
    public void add(Double money) {
        System.out.println("增加支付金额");
    }

    @Override
    public void update(Double money) {
        System.out.println("更新支付金额");
    }

    @Override
    public void delete(long id) {
        System.out.println("删除支付功能");
    }
}
