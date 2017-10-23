package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserContrller {

    @RequestMapping("user")
    public String jump(){
        return "ask";
    }


}
