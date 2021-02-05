package com.wsj.springcloud.service.factory;

import com.wsj.springcloud.pojo.User;
import com.wsj.springcloud.service.UserClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/2/5 10:20 上午
 */
@Component
public class UserClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public UserClientService create(Throwable throwable) {
        return new UserClientService() {
            @Override
            public boolean add(User user) {
                return false;
            }

            @Override
            public void delete(Long id) {

            }

            @Override
            public void update(User user) {

            }

            @Override
            public User getOne(Long id) {
                return new User().setId(Integer.parseInt(id+""))
                        .setUsername("id=====>" + id + "没有查找到对应的信息(服务降级)")
                        .setDbSource("no search dbSource in MYSQL");
            }

            @Override
            public List<User> getAll() {
                return null;
            }
        };
    }
}
