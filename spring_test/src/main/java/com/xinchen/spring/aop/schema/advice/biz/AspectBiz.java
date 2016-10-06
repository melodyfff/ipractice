package com.xinchen.spring.aop.schema.advice.biz;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 上午12:35:13
 * @version V1.0
 */
public class AspectBiz {
	public void biz() {
		System.out.println("AspectBiz biz");
		// throw new RuntimeException();
	}

	public void init(String bizName, int times) {
		System.out.println("AspectBiz init:" + bizName + " " + times);
	}

}