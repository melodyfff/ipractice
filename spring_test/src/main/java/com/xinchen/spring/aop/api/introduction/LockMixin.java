package com.xinchen.spring.aop.api.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午2:36:03
 * @version V1.0
 */
public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {

	private static final long seriaVersionUID = 1L;

	private boolean locked;

	@Override
	public void lock() {
		this.locked = true;

	}

	@Override
	public void unlock() {
		this.locked = false;

	}

	@Override
	public boolean locked() {
		return this.locked;
	}

	public Object invoke(MethodInvocation invocation) throws Throwable {
		if (locked() && invocation.getMethod().getName().indexOf("set") == 0){
			throw new RuntimeException();
		}
			return super.invoke(invocation);

	}

}
