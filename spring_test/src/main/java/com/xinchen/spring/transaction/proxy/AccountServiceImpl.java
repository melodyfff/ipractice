package com.xinchen.spring.transaction.proxy;



/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午11:05:49
 * @version V1.0
 */
public class AccountServiceImpl implements AccountService {
	// 注入dao类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	

	/**
	 * @param out
	 *            转出账号
	 * @param in
	 *            转入账号
	 * @param money
	 *            转账金额
	 */
	public void transfer( String out, String in, Double money) {
		 System.out.println("开始从<" + out + ">转出:" + money);
		 accountDao.outMoney(out, money);
		 System.out.println("转出结束");
		
		 //设置异常
		 //int i = 1 / 0;
		
		 System.out.println("开始转入<" + in + ">转入:" + money);
		 accountDao.inMoney(in, money);
		 System.out.println("转入结束");
		
		

	}

}
