package com.example.springbootdemo.common.Exception;

import com.example.springbootdemo.common.enums.CustomerExceptionType;

public class CustomerException extends RuntimeException{
    private final Integer code;
    private final String meessage;
    public CustomerException(CustomerExceptionType customerExcepionType, String meessage){
        this.code = customerExcepionType.getCode();
        this.meessage = meessage;
    }

    public Integer getCode() {
        return code;
    }

    public String getMeessage() {
        return meessage;
    }
}
