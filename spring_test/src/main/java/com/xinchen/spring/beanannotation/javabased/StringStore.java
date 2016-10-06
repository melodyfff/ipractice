package com.xinchen.spring.beanannotation.javabased;

import org.springframework.stereotype.Component;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午5:48:32 
* @version V1.0   
*/
@Component
public class StringStore implements Store<String> {
	public void init(){
		System.out.println("this is init");
	}
	
	public void destory(){
		System.out.println("this is destory");
	}
}
