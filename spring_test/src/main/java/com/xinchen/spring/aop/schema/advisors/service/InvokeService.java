package com.xinchen.spring.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午1:22:13 
* @version V1.0   
*/
@Service
public class InvokeService {
	public void Invoke() {
		System.out.println("InvokeService......");
	}
	
	public void invokeException(){
		throw new PessimisticLockingFailureException("test");
	}
}
