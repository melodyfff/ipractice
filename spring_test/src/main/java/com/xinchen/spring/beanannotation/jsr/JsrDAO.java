package com.xinchen.spring.beanannotation.jsr;

import org.springframework.stereotype.Repository;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午11:39:16 
* @version V1.0   
*/
@Repository
public class JsrDAO {
	public void save(){
		System.out.println("JsrDAO invoked");
	}
}
