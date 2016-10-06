package com.xinchen.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 上午1:19:41 
* @version V1.0   
*/

public class BeanLifeCycle implements InitializingBean,DisposableBean {
	
	public void defaultInit(){
		System.out.println("bean defaultInit");
	}
	
	public void defaultDestroy(){
		System.out.println("bean defaultDestroy");
	}
	
	 @Override
	 public void destroy() throws Exception {
	 // TODO Auto-generated method stub
	 System.out.println("bean InitializingBean");
	 }
	
	 @Override
	 public void afterPropertiesSet() throws Exception {
	 // TODO Auto-generated method stub
	 System.out.println("bean DisposableBean");
	 }
	 public void start(){
	 System.out.println("Bean start");
	 }
	
	 public void end(){
	 System.out.println("Bean end");
	 }
}
