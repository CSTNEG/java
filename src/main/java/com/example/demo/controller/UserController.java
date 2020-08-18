package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by ChaoFeng Cotter on 2020/8/18.
 */
@Controller
public class UserController {
    @RequestMapping("/helle")
    public String hello(Model model){
        System.out.println("进入了shello方法");
        model.addAttribute("name","张三");
        return "hello";
    }
}
