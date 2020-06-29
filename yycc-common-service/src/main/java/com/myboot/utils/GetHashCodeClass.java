package com.myboot.utils;

/**
 * FileName: GetHashCodeClass
 * Author:   wangwenchao
 * Date:     2020/6/29 14:56
 * Description: 目标实现类
 */
public class GetHashCodeClass {
    private String targe;
    public GetHashCodeClass(String target){
        this.targe = target;
    }

    public String getHashCode(){
        return String.valueOf(this.targe.hashCode());
    }

}
