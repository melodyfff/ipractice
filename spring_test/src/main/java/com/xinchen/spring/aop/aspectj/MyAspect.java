package com.xinchen.spring.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午4:18:38
 * @version V1.0
 */
@Component
@Aspect
public class MyAspect {
	@Pointcut("execution(* com.xinchen.spring.aop.aspectj.biz.*Biz.*(..))")
	public void pointcut() {
	}

	// 当前这个包下的任何类
	@Pointcut("within(com.xinchen.spring.aop.aspectj.biz.*)")
	public void bizPointcut() {
	}

	// @Before("execution(* com.xinchen.spring.aop.aspectj.biz.*Biz.*(..))")
	@Before("pointcut()")
	public void before() {
		System.out.println("Before.");
	}

	@Before("pointcut() && args(arg)")
	public void beforeWithParam(String arg) {
		System.out.println("BeforeWithParam:"+arg);
	}
	@Before("pointcut() && @annotation(myMethod)")
	public void beforeWithAnnotation(MyMethod myMethod) {
		System.out.println("BeforeWithAnnotation:"+myMethod.value());
	}

	@AfterReturning(pointcut = "bizPointcut()", returning = "returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("AfterReturning:" + returnValue);
	}

	@AfterThrowing(pointcut = "pointcut()", throwing = "e")
	public void afterThrowing(RuntimeException e) {
		System.out.println("AfterThrowing:" + e.getMessage());
	}

	@After("pointcut()")
	public void after() {
		System.out.println("After.");
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around 1.");
		Object obj = pjp.proceed();
		System.out.println("Around 2.");
		System.out.println("Around:" + obj);
		return obj;
	}
}
