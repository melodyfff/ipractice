package com.xinchen.spring.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午11:38:53
 * @version V1.0
 */
//@Service
@Named
public class JsrService {
	//@Autowired
	//@Resource
	//@Inject
	private JsrDAO jsDAO;
	//@Autowired
	// @Resource
	@Inject
	public void setJsDAO(@Named("jsrDAO")JsrDAO jsDAO) {
		this.jsDAO = jsDAO;
	}
	@PostConstruct
	public void init(){
		System.out.println("JsrService init");
	}
	@PreDestroy
	public void destory(){
		System.out.println("JsrService destory");
	}

	public void save() {
		jsDAO.save();
	}
}
