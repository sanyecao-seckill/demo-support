package com.demo.support.dto;

import com.demo.support.constant.ResultCodeConstant;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private String code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(T data) {
        this.data = data;
        this.code = ResultCodeConstant.SUCCESS;
    }

    public Result(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
