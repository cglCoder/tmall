package com.aopioc.tmall.web.controller;

import com.aopioc.tmall.common.CodeMessage;
import com.aopioc.tmall.common.ResponseResult;
import com.aopioc.tmall.entity.User;
import com.aopioc.tmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.web.controller
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 18:44
 */
@RestController
@RequestMapping("/index")
public class IndexController {


    @Resource
    private UserService userService;

    //https://blog.csdn.net/kunge_/article/details/78627465
    @RequestMapping("/1")
    public Object index(){
        List<User> one = null;
        try {
            one = userService.findOne();
            //int i =1/0;
            return ResponseResult.success(one);
        } catch (Exception e) {
            //e.printStackTrace();
            return ResponseResult.error(new CodeMessage(2022,"娶你打野的"));
        }
    }
}
