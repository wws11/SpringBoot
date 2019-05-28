package com.gysoft.springboothello.com.gysoft.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author DJZ-WWS
 * @Date 2019/5/28 13:35
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
//这个注解是用来表名一个properties文件的bean映射，想获取properties的时候可以使用这个注解获取值
@ConfigurationProperties(prefix = "my")
public class Properties {

private   int  age;
private  String   name;


    @Override
    public String toString() {
        return "Properties{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
