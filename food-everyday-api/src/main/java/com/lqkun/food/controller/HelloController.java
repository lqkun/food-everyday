package com.lqkun.food.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @className: com.lqkun.food.controller-> HelloController
 * @description: TODO
 * @author: LQKun
 * @date: 2022-03-20 21:51
 * @version: 1.0
 */
@Api(value = "健康检查", tags = {"用于检查系统运行状况接口"})
@RestController
public class HelloController {

    @ApiOperation(value = "健康检查", notes = "健康检查", httpMethod = "GET")
    @GetMapping("/health")
    public String health(){
        return HttpStatus.OK.name();
    }
}
