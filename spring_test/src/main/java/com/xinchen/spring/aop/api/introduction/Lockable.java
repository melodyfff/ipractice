package com.xinchen.spring.aop.api.introduction;
/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午2:35:08 
* @version V1.0   
*/
public interface Lockable {
	void lock();
	void unlock();
	boolean locked();
}
