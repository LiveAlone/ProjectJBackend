package org.yqj.project.web.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yqj.project.api.DemoService;
import org.yqj.project.web.model.AddressResponse;
import org.yqj.project.web.model.BaseResponse;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2021/10/28
 * Email: yaoqijunmail@foxmail.com
 */
@RestController
public class HelloController {

    @DubboReference
    private DemoService demoService;

    @RequestMapping(value = "/address", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<AddressResponse> address() throws UnknownHostException {
        return BaseResponse.successResponse(new AddressResponse(InetAddress.getLocalHost().getHostName(), InetAddress.getLocalHost().getHostAddress()));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<String> hello(@Param("param") String param) {
        return BaseResponse.successResponse(demoService.sayHello(param));
    }
}
