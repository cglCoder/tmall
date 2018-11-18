package com.aopioc.tmall.service.impl;

import com.aopioc.tmall.entity.User;
import com.aopioc.tmall.repository.UserRepository;
import com.aopioc.tmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.service.impl
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 19:02
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findOne() {
        return userRepository.findAll();
    }
}
