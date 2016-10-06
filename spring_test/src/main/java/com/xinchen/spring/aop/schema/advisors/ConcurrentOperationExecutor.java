package com.xinchen.spring.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午1:11:53
 * @version V1.0
 */
public class ConcurrentOperationExecutor implements Ordered {
	private static final int DEFAULT_MAX_RETRIES = 2;
	private int maxRetries = DEFAULT_MAX_RETRIES;
	private int order = 1;

	public void setMaxRetries(int maxRetries) {
		this.maxRetries = maxRetries;
	}

	public int getOrder() {
		return this.order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Object doCouncurrentOperation(ProceedingJoinPoint pjp) throws Throwable{
		int numAttenpts = 0;
		PessimisticLockingFailureException lockingFailureException;
		System.out.println("开始环绕");
		do{
			numAttenpts++;
			System.out.println("Try times:"+numAttenpts);
			try{
				System.out.println(pjp.getClass().getName());
				return pjp.proceed();
			}catch(PessimisticLockingFailureException ex){
				lockingFailureException = ex;
			}
		}while(numAttenpts <= this.maxRetries);
		System.out.println("Try error:"+numAttenpts);
		throw lockingFailureException;
	}

}
