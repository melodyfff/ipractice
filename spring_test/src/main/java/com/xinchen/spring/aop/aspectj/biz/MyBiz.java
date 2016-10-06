package com.xinchen.spring.aop.aspectj.biz;

import org.springframework.stereotype.Service;

import com.xinchen.spring.aop.aspectj.MyMethod;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午4:30:44
 * @version V1.0
 */
@Service
public class MyBiz {
	@MyMethod("MyBiz save with MyMethod")
	public String save(String arg) {
		System.out.println("MyBiz:" + arg);
		//throw new RuntimeException("RuntimeExceptiontest");
		return "Save success!";
	}
}
