package com.xinchen.spring.aop.api;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午2:27:40 
* @version V1.0   
*/
public class MyMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("MyMethodInterceptor 1:"+invocation.getMethod().getName()
				+"    "+invocation.getStaticPart().getClass().getName());
		Object obj = invocation.proceed();
		System.out.println("MyMethodInterceptor 2:"+obj);
		return obj;
	}


}
