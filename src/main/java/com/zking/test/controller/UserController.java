package com.zking.test.controller;

import com.zking.test.model.User;
import com.zking.test.util.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/reg")
    @ResponseBody
    public  JsonData reg(@Validated User user, BindingResult bindingResult) {
        log.info("reg...");
        log.info("{}",user);
        JsonData jsonData=new JsonData();
        if (bindingResult.hasErrors()) {
            Map<String,String > errors=new HashMap<String,String>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError e:fieldErrors){

                errors.put( e.getField(),e.getDefaultMessage());
            }
            log.info("errors{}" ,errors);
            jsonData.setCode(-1);
            jsonData.put("errors",errors);
        }else{
            jsonData.setCode(1);
            jsonData.setMessage("注册成功");
        }
        return jsonData;

    }
    @PostMapping("/login")
    public  JsonData login(@Validated User user, BindingResult bindingResult) {
        log.info("login...");
        log.info("{}",user);
        JsonData jsonData=new JsonData();
        if (bindingResult.hasErrors()) {
            Map<String,String > errors=new HashMap<String,String>();
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            for (FieldError e:fieldErrors){

                errors.put( e.getField(),e.getDefaultMessage());
            }
            log.info("errors{}" ,errors);
            jsonData.setCode(-1);
            jsonData.put("errors",errors);
        }else{
            jsonData.setCode(1);
            jsonData.setMessage("注册成功");
        }
        return jsonData;

    }
}
