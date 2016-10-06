package com.xinchen.spring.aop.api.introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午2:41:45 
* @version V1.0   
*/
public class LockMixinAdvisor extends DefaultIntroductionAdvisor{
	private static final long seriaVersionUID = 1L;
	
	public LockMixinAdvisor() {
		super(new LockMixin(),Lockable.class);
		// TODO Auto-generated constructor stub
	}

}
