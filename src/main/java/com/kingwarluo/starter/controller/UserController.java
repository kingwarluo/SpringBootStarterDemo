package com.kingwarluo.starter.controller;

import com.kingwarluo.starter.domain.User;
import com.kingwarluo.starter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:控制器
 *
 * @author jianhua.luo
 * @date 2019/7/20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getById/{id}")
    @ResponseBody
    public User getById(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

}
