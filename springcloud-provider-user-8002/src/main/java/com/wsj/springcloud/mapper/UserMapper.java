package com.wsj.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wsj.springcloud.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/5 9:27 下午
 */
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
