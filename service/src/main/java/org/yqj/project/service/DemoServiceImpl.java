package org.yqj.project.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.yqj.project.api.DemoService;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2024/4/23
 * Email: yaoqijunmail@foxmail.com
 */
@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return String.format("hello world %s dubbo provider service", name);
    }
}
