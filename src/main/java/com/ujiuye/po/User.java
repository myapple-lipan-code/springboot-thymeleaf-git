package com.ujiuye.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @program: springboot-jpa-thymeleaf
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-07 22:19
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name" ,nullable = true, length = 100)
    private String name;
    @Column(name = "age" ,nullable = true)
    private Integer age;
}
