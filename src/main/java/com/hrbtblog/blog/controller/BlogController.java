package com.hrbtblog.blog.controller;

import com.hrbtblog.blog.domain.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author liudi
 * @Date Create in 17:03 2018/12/26
 */
@Controller
public class BlogController {

    @RequestMapping("/22")
    public String  blogIndex(){
        return "index";
    }

    @RequestMapping("/loginBoot")
    public String  loginBoot(){
        return "login";
    }

    @RequestMapping("/loginInclude")
    public String  loginInclude(){
        return "include";
    }
    @RequestMapping("/loginTest")
    public String  loginTest(){
        return "test";
    }

}
