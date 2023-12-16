package com.isc.backstage.controller;

import com.isc.backstage.domain.DTO.LoginUserDTO;
import com.isc.backstage.domain.Result;
import com.isc.backstage.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/str-hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody @Validated LoginUserDTO dto){
        return userService.login(dto);
    }
}
