package com.lqkun.food.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

/**
 * @author 65359
 * @Title: LqKunResult.java
 * @Package com.lqkun.food.utils
 * @Description: 自定义响应数据结构
 * 200：表示成功
 * 500：表示错误，错误信息在msg字段中
 * 501：bean验证错误，不管多少个错误都以map形式返回
 * 502：拦截器拦截到用户token出错
 * 555：异常抛出信息
 * 556: 用户qq校验异常
 */
@Data
public class LqKunResult {

    /**
     * 定义jackson对象
     **/
    private static final ObjectMapper MAPPER = new ObjectMapper();
    /**
     * 响应业务状态
     **/
    private Integer status;

    /**
     * 响应消息
     **/
    private String msg;

    /**
     * 响应中的数据
     **/
    private Object data;
    /**
     * 不使用
     **/
    @JsonIgnore
    private String ok;

    public static LqKunResult build(Integer status, String msg, Object data) {
        return new LqKunResult(status, msg, data);
    }

    public static LqKunResult build(Integer status, String msg, Object data, String ok) {
        return new LqKunResult(status, msg, data, ok);
    }

    public static LqKunResult ok(Object data) {
        return new LqKunResult(data);
    }

    public static LqKunResult ok() {
        return new LqKunResult(null);
    }

    public static LqKunResult errorMsg(String msg) {
        return new LqKunResult(500, msg, null);
    }

    public static LqKunResult errorMap(Object data) {
        return new LqKunResult(501, "error", data);
    }

    public static LqKunResult errorTokenMsg(String msg) {
        return new LqKunResult(502, msg, null);
    }

    public static LqKunResult errorException(String msg) {
        return new LqKunResult(555, msg, null);
    }

    public static LqKunResult errorUserQQ(String msg) {
        return new LqKunResult(556, msg, null);
    }

    public LqKunResult() {

    }

    public LqKunResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public LqKunResult(Integer status, String msg, Object data, String ok) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.ok = ok;
    }

    public LqKunResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

}
