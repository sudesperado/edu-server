package com.zhitong.gatewayserver.contrller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : subs
 * @Project: edu-server
 * @Package com.zhitong.gatewayserver.contrller
 * @Description:
 * @date Date : 2020年12月14日 11:23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/getString")
    public void getString(){
        System.out.println("hello world!");
    }
}
