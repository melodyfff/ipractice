package com.xinchen.spring.autowiring;
/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午2:44:40 
* @version V1.0   
*/
public class AutoWiringService {
	private AutoWiringDAO autoWiringDAO;
	
	//通过构造器注入
	// public AutoWiringService(AutoWiringDAO autoWiringDAO){
	// System.out.println("AutoWiringService被调用");
	// this.autoWiringDAO = autoWiringDAO;
	// }
	
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		System.out.println("setAutoWiringDAO方法被调用");
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say(String arg){
		System.out.println("AutoWiringService:接受参数----"+arg);
		this.autoWiringDAO.say(arg);
	}
}
