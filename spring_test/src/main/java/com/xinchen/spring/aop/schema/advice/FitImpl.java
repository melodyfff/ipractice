package com.xinchen.spring.aop.schema.advice;
/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午12:24:53 
* @version V1.0   
*/
public class FitImpl implements Fit{

	@Override
	public void filter() {
		System.out.println("FitImpl filter");
	}

}
