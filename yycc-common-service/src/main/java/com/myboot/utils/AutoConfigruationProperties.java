package com.myboot.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * FileName: AutoConfigruationProperties
 * Author:   wangwenchao
 * Date:     2020/6/29 14:57
 * Description: 配置文件读取类
 */
@ConfigurationProperties("target.string")
public class AutoConfigruationProperties {
    private String target;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

}
