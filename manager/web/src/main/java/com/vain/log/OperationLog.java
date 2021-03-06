package com.vain.log;

import java.lang.annotation.*;

/**
 * @author vain
 * @date： 2017/11/3 11:07
 * @description： 自定义注解拦截操作日志
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface OperationLog {

    int operationType(); //操作类型

    String info() default ""; // 操作信息

    boolean isOnlyId() default false;//是否只保存请求参数id
}
