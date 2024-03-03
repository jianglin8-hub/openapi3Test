package com.example.openapi.demoopenapi.controller;

import com.example.openapi.demoopenapi.bean.Result;
import jakarta.validation.constraints.NotBlank;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test1")
    public Result test1(String ip) {
        return new Result();
    }

    @PostMapping("/test2")
    public Result test2(@NotBlank String ip) {
        return new Result();
    }
}
