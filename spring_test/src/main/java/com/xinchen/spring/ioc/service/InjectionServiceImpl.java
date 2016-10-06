package com.xinchen.spring.ioc.service;

import com.xinchen.spring.beanannotation.injection.dao.InjectionDAO;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 上午12:13:34
 * @version V1.0
 */
public class InjectionServiceImpl implements InjectionService {

	private InjectionDAO injectionDao;

	// 用于spring装配时调用
	public void setInjectionDao(InjectionDAO injectionDao) {
		System.out.println("spring装配调用setter");
		this.injectionDao = injectionDao;
	}

	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Service接收参数" + arg);
		arg = arg + ":" + arg.hashCode();
		injectionDao.save(arg);
	}

}
