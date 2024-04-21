package org.yqj.project.web;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.StringCodec;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.yqj.project.web.mapper.User;
import org.yqj.project.web.service.UserService;

import java.util.Collection;
import java.util.List;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/8/15
 * Email: yaoqijunmail@foxmail.com
 */
@Component
@Slf4j
public class RunCommandLine implements CommandLineRunner {

    @Resource
    private UserService userService;

    @Resource
    private RedissonClient redissonClient;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = userService.list();
        log.info("user list size is {}", users.size());

        if (CollectionUtils.isEmpty(users)) {
            return;
        }
        User user = users.getFirst();
        RMap<String, String> userRMap = redissonClient.getMap("user_collection");
        log.info("redisson put user :{}", userRMap.put(user.getId().toString(), user.toString()));
        log.info("redisson get user :{}", userRMap.get(user.getId().toString()));
    }
}
