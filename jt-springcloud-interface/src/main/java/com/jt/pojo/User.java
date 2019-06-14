package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @auther: panda
 * @date: 2019/6/13
 * @descripton: com.jt.pojo
 * @version: 1.0
 */
@TableName("user")
@Data
@Accessors(chain = true)
public class User {
    @TableId(type = IdType.AUTO)
    Integer id;
    String name;
    Integer age;
    String sex;

}
