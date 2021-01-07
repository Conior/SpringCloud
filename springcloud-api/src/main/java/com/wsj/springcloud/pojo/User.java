package com.wsj.springcloud.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wangshijian
 * @Description:
 * @date 2021/1/4 9:29 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true) // 开启链式写法
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String creator;

    private String modifier;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String isdelete;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
