package com.gysoft.springboothello.com.gysoft.annotation;

import java.lang.annotation.*;

/**
 * Create by wws on 2019/5/28
 * 锁的注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface LocalLock {

    /**
     * @author fly
     */
    String key() default "";

    /**
     * 过期时间 TODO 由于用的 guava 暂时就忽略这属性吧 集成 redis 需要用到
     *
     * @author fly
     */
    int expire() default 5;
}