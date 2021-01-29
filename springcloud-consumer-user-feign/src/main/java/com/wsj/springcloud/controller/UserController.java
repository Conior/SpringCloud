package com.wsj.springcloud.controller;

import com.wsj.springcloud.pojo.User;
import com.wsj.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/6 8:46 下午
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    @Autowired
    UserClientService userClientService;

    @PostMapping("/add")
    public boolean add(User user){
        return userClientService.add(user);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userClientService.delete(id);
    }

    @PostMapping("/update")
    public void update(User user){
        userClientService.update(user);
    }

    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable("id") Long id){
        return userClientService.getOne(id);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return userClientService.getAll();
    }
}
