package com.aopioc.tmall.repository;

import com.aopioc.tmall.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.repository
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 18:59
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
