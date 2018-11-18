package com.aopioc.tmall.common;

import lombok.Data;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.common
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 21:03
 */
@Data
public class CodeMessage {


    private int code;

    private String message;



    //通用的错误码
    public static CodeMessage SUCCESS = new CodeMessage(200, "success");
    public static CodeMessage SERVER_ERROR = new CodeMessage(500100, "服务端异常");
    public static CodeMessage BIND_ERROR = new CodeMessage(500101, "参数校验异常：%s");
    public static CodeMessage REQUEST_ILLEGAL = new CodeMessage(500102, "请求非法");
    public static CodeMessage ACCESS_LIMIT_REACHED= new CodeMessage(500104, "访问太频繁！");

    //登录模块 5002XX
    public static CodeMessage SESSION_ERROR = new CodeMessage(500210, "Session不存在或者已经失效");
    public static CodeMessage PASSWORD_EMPTY = new CodeMessage(500211, "登录密码不能为空");
    public static CodeMessage MOBILE_EMPTY = new CodeMessage(500212, "手机号不能为空");
    public static CodeMessage MOBILE_ERROR = new CodeMessage(500213, "手机号格式错误");
    public static CodeMessage MOBILE_NOT_EXIST = new CodeMessage(500214, "手机号不存在");
    public static CodeMessage PASSWORD_ERROR = new CodeMessage(500215, "密码错误");

    //商品模块 5003XX
    //订单模块 5004XX
    public static CodeMessage ORDER_NOT_EXIST = new CodeMessage(500400, "订单不存在");
    //秒杀模块 5005XX
    public static CodeMessage MIAO_SHA_OVER = new CodeMessage(500500, "商品已经秒杀完毕");
    public static CodeMessage REPEATE_MIAOSHA = new CodeMessage(500501, "不能重复秒杀");
    public static CodeMessage MIAOSHA_FAIL = new CodeMessage(500502, "秒杀失败");

    public CodeMessage() {
    }

    public CodeMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public CodeMessage fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.message, args);
        return new CodeMessage(code, message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "CodeMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}