package com.cloud.common.dto;

import java.io.Serializable;

public class R<T> implements Serializable {
    private static final long serialVersionUID = 6037176820363504311L;
    /**
     * 成功失败标识
     **/
    private boolean success = true;
    /**
     * 错误码 默认1
     **/
    private Integer code = 1;
    /**
     * 消息
     **/
    private String msg = "";
    /**
     * 数据
     **/
    private T data = null;

    public static R getInstance() {
        return new R();
    }
    public static R<Object> getInstance(Object data) {
        return new R<>(data);
    }
    public static R<Object> getInstance(Object data, ResCode resCode) {
        return new R<>(resCode,data);
    }
    public R() {
    }
    public R(T data) {
        this.data = data;
    }
    public R(ResCode resCode, T data) {
        this.success = Boolean.FALSE;
        this.code = resCode.getCode() ;
        this.msg = resCode.getMsg();
        this.data = data;
    }
    public R(ResCode resCode) {
        this.success = Boolean.FALSE;
        this.code = resCode.getCode() ;
        this.msg = resCode.getMsg();
    }
    public R(Integer code, String msg) {
        this.success = Boolean.FALSE;
        this.code = code;
        this.msg = msg;
    }
    public R(Integer code, String msg, T data) {
        this.success = Boolean.FALSE;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
