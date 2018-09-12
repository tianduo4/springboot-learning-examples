package com.zhenziren.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    @ApiOperation(value = "返回HelloWorld", notes = "返回HelloWorld")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello Swagger2!";
    }
}
