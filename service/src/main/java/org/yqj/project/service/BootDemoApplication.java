package org.yqj.project.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2018/8/15
 * Email: yaoqijunmail@foxmail.com
 */
@SpringBootApplication
@EnableDubbo
public class BootDemoApplication {
    public static void main(String[] args) {
        String[] params = new String[]{};
        new SpringApplicationBuilder()
                .allowCircularReferences(true)
                .sources(BootDemoApplication.class)
                .run(params);
    }
}
