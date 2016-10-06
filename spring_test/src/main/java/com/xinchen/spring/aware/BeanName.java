package com.xinchen.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午1:53:11 
* @version V1.0   
*/
public class BeanName implements BeanNameAware,ApplicationContextAware{
	
	private String beanName;
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("BeanName:"+name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext:"+applicationContext.getBean(beanName).hashCode());
	}

}
