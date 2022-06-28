package com.example.springbootdemo.ExceptionHandler;

import com.example.springbootdemo.common.AjaxResponse;
import com.example.springbootdemo.common.Exception.CustomerException;
import com.example.springbootdemo.common.enums.CustomerExceptionType;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice//捕捉所有从controller中抛出的异常
public class WebExceptionHandler {

    @ExceptionHandler(CustomerException.class)
    @ResponseBody
    public AjaxResponse customerException(CustomerException e){
        if (e.getCode()== CustomerExceptionType.SYSTEM_ERROR.getCode()){
            //TODO 输入错误到日志文件
        }
        return AjaxResponse.error(e);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public AjaxResponse exception(Exception e){
        //输出到日志文件
        //TODO 输出到日志文件
        return AjaxResponse.error(new CustomerException(CustomerExceptionType.OTHER_ERROR,"为止异常"));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)//捕获数据校验失败后抛出的异常
    @ResponseBody
    public AjaxResponse handleBindException(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomerException(CustomerExceptionType.USER_INPUT_ERROR,fieldError.getDefaultMessage()));
    }


    @ExceptionHandler(BindException.class)//捕获数据校验失败后抛出的异常
    @ResponseBody
    public AjaxResponse handleBindException(BindException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        return AjaxResponse.error(new CustomerException(CustomerExceptionType.USER_INPUT_ERROR,fieldError.getDefaultMessage()));
    }
}
