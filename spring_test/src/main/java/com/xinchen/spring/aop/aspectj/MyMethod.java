package com.xinchen.spring.aop.aspectj;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午4:58:23 
* @version V1.0   
*/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyMethod {
	String value();
}
