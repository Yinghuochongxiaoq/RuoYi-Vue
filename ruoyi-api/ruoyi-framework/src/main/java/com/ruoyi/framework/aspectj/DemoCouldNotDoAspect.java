package com.ruoyi.framework.aspectj;

import com.ruoyi.common.exception.DemoModeException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 自定义demo方法不能处理
 *
 * @author ruoyi
 */
@Aspect
@Component
public class DemoCouldNotDoAspect {
    @Value("${ruoyi.demoEnabled}")
    private Boolean demoEnabled;

    @Pointcut("@annotation(com.ruoyi.common.annotation.DemoCouldNotDo)")
    public void demoCouldNotDoPointCut(){
    }

    @Before("demoCouldNotDoPointCut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        if(demoEnabled){
            throw new DemoModeException();
        }
    }
}
