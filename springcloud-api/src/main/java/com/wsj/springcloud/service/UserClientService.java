package com.wsj.springcloud.service;

import com.wsj.springcloud.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/28 11:29 上午
 */
// value是提供服务的服务名    path是接口的公共路径
@FeignClient(value = "SPRINGCLOUD-PROVIDER-USER",path = "/user")
@Component
public interface UserClientService {

    @PostMapping("/add")    // 此处的请求路径是服务提供者中Controller的路径
    public boolean add(User user);

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id);

    @PostMapping("/update")
    public void update(User user);

    @GetMapping("/getOne/{id}")
    public User getOne(@PathVariable("id") Long id);

    @GetMapping("/getAll")
    public List<User> getAll();
}
