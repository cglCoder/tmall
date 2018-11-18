package com.aopioc.tmall.common;

import lombok.Data;

/**
 * 项目名称 : tmall
 * 包名 : com.aopioc.tmall.common
 * 功能介绍 : TODO
 *
 * @author : JefferyChang
 * 日期 : 2018/11/18 20:44
 */
@Data
public class ResponseResult<T> {

    private int code;
    private String msg;
    private T data;

    /**
     *  成功时候的调用
     * */
    public static  <T> ResponseResult<T> success(T data){
        return new ResponseResult<T>(CodeMessage.SUCCESS,data);
    }

    /**
     *  失败时候的调用
     * */
    public static  <T> ResponseResult<T> error(CodeMessage CodeMessage){
        return new ResponseResult<T>(CodeMessage);
    }

    private ResponseResult(T data) {
        this.data = data;
    }

    private ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResponseResult(CodeMessage CodeMessage) {
        if(CodeMessage != null) {
            this.code = CodeMessage.getCode();
            this.msg = CodeMessage.getMessage();
        }
    }

    private ResponseResult (CodeMessage CodeMessage,T data) {
        if(CodeMessage != null) {
            this.code = CodeMessage.getCode();
            this.msg = CodeMessage.getMessage();
            this.data = data;
        }
    }









}
