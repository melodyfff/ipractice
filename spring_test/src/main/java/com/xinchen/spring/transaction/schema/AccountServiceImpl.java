package com.xinchen.spring.transaction.schema;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

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
	
	//注入事务管理模板
	private TransactionTemplate transactionTemplate;
	

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	/**
	 * @param out
	 *            转出账号
	 * @param in
	 *            转入账号
	 * @param money
	 *            转账金额
	 */
	public void transfer(final String out,final String in,final Double money) {
		// System.out.println("开始从<" + out + ">转出:" + money);
		// accountDao.outMoney(out, money);
		// System.out.println("转出结束");
		//
		// //设置异常
		// //int i = 1 / 0;
		//
		// System.out.println("开始转入<" + in + ">转入:" + money);
		// accountDao.inMoney(in, money);
		// System.out.println("转入结束");
		
		//开始使用事务管理
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
					
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				 System.out.println("开始从<" + out + ">转出:" + money);
				 accountDao.outMoney(out, money);
				 System.out.println("转出结束");
				
				 //设置异常
				 //int i = 1 / 0;
				
				 System.out.println("开始转入<" + in + ">转入:" + money);
				 accountDao.inMoney(in, money);
				 System.out.println("转入结束");
			}
		});

	}

}
