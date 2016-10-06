package com.xinchen.spring.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinchen.spring.beanannotation.injection.dao.InjectionDAO;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 上午12:13:34
 * @version V1.0
 */
@Service
public class InjectionServiceImpl implements InjectionService {
	//@Autowired
	private InjectionDAO injectionDao;
	
	//构造器初始化
	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDao) {
		this.injectionDao = injectionDao;
	}
	
	//setter初始化
	//@Autowired
	public void setInjectionDao(InjectionDAO injectionDao) {
		this.injectionDao = injectionDao;
	}


	public void save(String arg) {
		// TODO Auto-generated method stub
		System.out.println("Service接收参数" + arg);
		arg = arg + ":" + arg.hashCode();
		injectionDao.save(arg);
	}

}
