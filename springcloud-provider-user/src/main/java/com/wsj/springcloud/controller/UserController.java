package com.wsj.springcloud.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsj.springcloud.pojo.User;
import com.wsj.springcloud.service.IUserService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;

/**
 * <p>
 *  前端控制器
 *  提供Restful服务
 * </p>
 *
 * @author wangshijian
 * @since 2020-12-08
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/add")
    public boolean add(User user){
        return userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Long id){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        return userService.remove(queryWrapper);
    }

    @PostMapping("/update")
    public boolean update(User user){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("password","654321");
        queryWrapper.eq("id",user.getId());
        return userService.update(user,queryWrapper);
    }

    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable("id") Long id){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        return userService.getOne(queryWrapper);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
         return userService.list();
    }
}
