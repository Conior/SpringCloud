package com.wsj.springcloud.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wsj.springcloud.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(User user){
        return restTemplate.postForObject(REST_URL_PREFIX + "/user/add", user, Boolean.class);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        restTemplate.delete(REST_URL_PREFIX + "/user/delete",id);
    }

    @PostMapping("/update")
    public void update(User user){
        restTemplate.put(REST_URL_PREFIX + "/user/update",null,user);
    }

    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/getOne/"+id, User.class);
    }

    @GetMapping("/getAll")
    public List<User> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/getAll",List.class);
    }
}
