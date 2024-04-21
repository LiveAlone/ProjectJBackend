package org.yqj.project.web.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2024/4/18
 * Email: yaoqijunmail@foxmail.com
 */
@Data
@TableName("`user`")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
