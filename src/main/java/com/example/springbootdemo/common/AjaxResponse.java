package com.example.springbootdemo.common;

import com.example.springbootdemo.common.Exception.CustomerException;
import com.example.springbootdemo.common.enums.CustomerExceptionType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class AjaxResponse {
    private Boolean isok;
    private Integer code;
    private String message;
    private Object data;
    public AjaxResponse(){}
    //返回的是枚举类中固定的内容
    public static AjaxResponse error(CustomerException e){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(false);
        resultBean.setCode(e.getCode());
        if(e.getCode() == CustomerExceptionType.USER_INPUT_ERROR.getCode()){
            resultBean.setMessage(e.getMessage());
        }else if(e.getCode() == CustomerExceptionType.SYSTEM_ERROR.getCode()){
            resultBean.setMessage(e.getMessage() + ",请将该异常信息发送给管理员!");
        }else{
            resultBean.setMessage("系统出现未知异常，请联系管理员!");
        }
        //TODO 这里最好将异常信息持久
        return resultBean;
    }

    //返回调用时传入的错误和自定义的消息
    public static AjaxResponse error(CustomerExceptionType customExceptionType,
                                     String errorMessage) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(false);
        resultBean.setCode(customExceptionType.getCode());
        resultBean.setMessage(errorMessage);
        return resultBean;
    }
    //无参返回
    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }
    //有参返回
    public static AjaxResponse success(Object data){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }

}
