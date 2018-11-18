package com.aopioc.tmall.service;

import com.aopioc.tmall.entity.User;
import jdk.nashorn.internal.ir.LiteralNode;

import java.util.List;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.service
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 19:00
 */
public interface UserService {


    List<User> findOne();
}
