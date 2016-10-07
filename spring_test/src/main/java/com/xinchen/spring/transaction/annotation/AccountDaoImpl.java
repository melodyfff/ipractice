package com.xinchen.spring.transaction.annotation;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 下午11:08:54
 * @version V1.0
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	/**
	 * @param out
	 *            转出账号
	 * @param money
	 *            转账金额
	 */
	public void outMoney(String out, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql, money, out);
	}

	/**
	 * @param in
	 *            转入账号
	 * @param money
	 *            转账金额
	 */
	public void inMoney(String in, Double money) {
		// TODO Auto-generated method stub
		String sql = "update account set money = money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money, in);
	}

}
