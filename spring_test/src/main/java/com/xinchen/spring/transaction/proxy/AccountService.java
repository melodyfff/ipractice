package com.xinchen.spring.transaction.proxy;
/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午11:04:03 
* @version V1.0   
*/
public interface AccountService {
	/**
	 * @param out	 转出账号
	 * @param in	 转入账号
	 * @param money	 转账金额
	 */
	public void transfer(String out,String in,Double money);
}
