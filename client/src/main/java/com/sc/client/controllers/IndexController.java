package com.sc.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FS
 * @since 2018-12-13
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

//    @Value("${hello}")
//    private String hello;

    @RequestMapping("/")
    public String index() {
        return "hello world from port " + port;
    }

//    @RequestMapping("hello")
//    public String hello() {
//        return hello;
//    }

}
