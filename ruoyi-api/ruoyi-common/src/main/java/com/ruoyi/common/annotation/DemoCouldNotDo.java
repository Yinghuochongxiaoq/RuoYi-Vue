package com.ruoyi.common.annotation;


import java.lang.annotation.*;

/**
 * 自定义demo方法不能处理
 *
 * @author freshman
 *
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DemoCouldNotDo {
}
