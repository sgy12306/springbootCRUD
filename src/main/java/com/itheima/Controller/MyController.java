package com.itheima.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
    @RequestMapping("/test1")
    public String test() {
        return "hello";
    }

}
