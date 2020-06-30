package com.mybuss.controller;

import com.myboot.utils.GetHashCodeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: MyTest
 * Author:   wangwenchao
 * Date:     2020/6/29 16:58
 * Description: 测试类
 */
@RestController
@RequestMapping("/test")
public class MyTest {
    @Autowired
    private GetHashCodeClass getHashCodeClass;

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        String hashCode = getHashCodeClass.getHashCode();
        return hashCode;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        String hashCode = getHashCodeClass.getTarge();
        return hashCode;
    }
}
