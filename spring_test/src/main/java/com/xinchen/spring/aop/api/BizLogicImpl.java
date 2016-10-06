package com.xinchen.spring.aop.api;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午2:03:14
 * @version V1.0
 */
public class BizLogicImpl implements BizLogic {

	@Override
	public String save() {
		System.out.println("BizLogicImpl:Logic save");
		return "Logic save";
		// throw new RuntimeException();
	}

}
