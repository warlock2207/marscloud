package com.mars.game.controller;

import com.mars.common.core.web.page.TableDataInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public void hello() {
        System.out.println("hello");
    }
}
