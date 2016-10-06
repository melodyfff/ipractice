package com.xinchen.spring.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午4:10:53
 * @version V1.0
 */
//@Component("bean")
@Scope("prototype")//默认是singleton
@Component//默认生成beanAnnotation的bean
public class BeanAnnotation {
	public void say(String arg) {
		System.out.println("BeanAnnotation:" + arg);
	}
	
	public void myHashCode(){
		System.out.println("myHashCode:"+this.hashCode());
	}
}
