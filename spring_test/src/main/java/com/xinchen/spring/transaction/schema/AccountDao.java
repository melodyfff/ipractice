package com.xinchen.spring.transaction.schema;
/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午11:07:38 
* @version V1.0   
*/
public interface AccountDao {
	/**
	 * @param out	 转出账号
	 * @param money	 转账金额
	 */
	public void outMoney(String out,Double money);
	/**
	 * @param in	 转入账号
	 * @param money	 转账金额
	 */
	public void inMoney(String in,Double money);
}
