package com.xinchen.spring.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午2:23:01 
* @version V1.0   
*/
public class MyAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("MyAfterReturningAdvice:"+method.getName()+
				"  "+target.getClass().getName()+"   "+
				returnValue);
	}

}
