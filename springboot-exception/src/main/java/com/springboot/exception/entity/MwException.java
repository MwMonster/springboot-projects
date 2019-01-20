package com.springboot.exception.entity;

/**
 * @author MwMonster
 * @Description TODO
 * @date 2019/1/20 11:45 PM
 */
public class MwException extends RuntimeException{


    private String code;
    private String msg;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public MwException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
