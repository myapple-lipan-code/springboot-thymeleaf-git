package com.ujiuye.controller;

import com.ujiuye.po.User;
import com.ujiuye.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: springboot-jpa-thymeleaf
 * @description
 * @author: 中公 Mr Li
 * @create: 2020-01-07 22:39
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getList(Model m) {
        List<User> users = userService.findAll();
        m.addAttribute("users",users);
        return "list";
    }
    /*
    点击跳转页面
     */
    @RequestMapping("toAdd")
    public String toAdd(Model m) {
        return "add";
    }
    @RequestMapping("save")
    public String save(Model m,User user) {
        userService.add(user);
        return "redirect:/";
    }

    /**
     * 跳转到编辑页面
     * @param m
     * @return
     */
    @GetMapping("/toEdit/{id}")
    public String toEdit(Model m,@PathVariable("id") Long id) {
        User user = userService.findOne(id);
        m.addAttribute("user",user);
        return "edit";
    }

    /**
     *
     * @param m
     * @return
     */
    @PostMapping("/update")
    public String update(Model m,User user) {
        userService.update(user);
        return "redirect:/";
    }
    @RequestMapping("/delete/{id}")
    public String delete(Model m,@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/";
    }


}
