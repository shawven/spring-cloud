package com.sc.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author FS
 * @since 2018-12-13
 */
@RestController
@RefreshScope
public class IndexController {

    @Value("${server.port}" )
    private String port;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/")
    public String index() {
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            return e.getMessage();
        }

        return "hello world from "  + addr.getHostName();
    }

    @RequestMapping("hello")
    public String hello() {
        return port + ":" + hello;
    }

}
