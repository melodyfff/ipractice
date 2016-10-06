package com.xinchen.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContext;

/**
 * @Description:利用ApplicationContextAware接口实现
 * @author xinchen
 * @date 2016年10月5日 下午1:52:59
 * @version V1.0
 */
public class MyApplicationContext implements ApplicationContextAware {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;
		System.out.println("文件输出-----MyApplicationContext"+applicationContext);
		System.out.println("文件输出-----MyApplicationContext:" + applicationContext.getBean("myApplicationContext").hashCode());
	}

}
