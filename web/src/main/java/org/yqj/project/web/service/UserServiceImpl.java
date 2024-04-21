package org.yqj.project.web.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import org.yqj.project.web.mapper.User;
import org.yqj.project.web.mapper.UserMapper;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2024/4/18
 * Email: yaoqijunmail@foxmail.com
 */
@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
