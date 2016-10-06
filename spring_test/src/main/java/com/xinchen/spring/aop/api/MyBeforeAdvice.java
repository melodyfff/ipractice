package com.xinchen.spring.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午2:15:16
 * @version V1.0
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("MyBeforeAdvice:" + method.getName() + "   " + target.getClass().getName());
	}

}
