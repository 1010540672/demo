package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyt on 2018/10/16.
 */
@ControllerAdvice
public class CommonExceptionHandler {

    /**
     *  拦截Exception类的异常
     * @param e
     * @return
     */
   // @ExceptionHandler(Exception.class)
    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
    @ResponseBody
    public Map<String,Object> exceptionHandler(Exception e){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode", "-99999");
        result.put("respMsg", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;
    }
    //处理自定义异常
    @ExceptionHandler(value = { CommonException.class})
    @ResponseBody
    public Map<String,Object> commonExceptionHandler(CommonException e){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("respCode-->",e.getCode() );
        result.put("respMsg--->", e.getMessage());
        //正常开发中，可创建一个统一响应实体，如CommonResp
        return result;
    }
}
