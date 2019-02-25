package com.rci.resort.detail.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/*@Component
@Aspect*/
@Slf4j
public class ResortDetailAdvice {
    /*@Before("execution(public * *(..))")
    public void loggerAdvice(JoinPoint logJoinPoint) {
    	log.info("before Method execution"+logJoinPoint.getSignature()+" argument"+logJoinPoint.getArgs());
    }
    */
}
