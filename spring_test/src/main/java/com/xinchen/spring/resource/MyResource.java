package com.xinchen.spring.resource;


import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午3:13:33 
* @version V1.0   
*/
public class MyResource implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext初始化");
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException{
		//默认依赖于applicationContext的创建方式，在单元测试base类中，是以classpath创建
		Resource resource = applicationContext.getResource("classpath:config.txt");
		System.out.println("Filename:"+resource.getFilename());
		System.out.println("长度："+resource.contentLength());
	}
}
