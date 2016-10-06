package com.xinchen.spring.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午5:48:50
 * @version V1.0
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
	
	// @Value("${url}")
	// private String url;
	// @Value("${jdbc.username}")
	// private String username;
	// @Value("${password}")
	// private String password;
	// //文件加载测试
	// @Bean
	// public MyDriverManager myDriverManager(){
	// return new MyDriverManager(url,username,password);
	// }
	//
	// @Bean(name="bean",initMethod="init",destroyMethod="destory")
	// //默认为方法名stringStore
	// public Store stringStore(){
	// return new StringStore();
	// }
	//
	// //Scope测试
	// @Bean(name="bean2",initMethod="init",destroyMethod="destory")
	// @Scope(value="prototype")//proxyMode=ScopedProxyMode.TARGET_CLASS 代理方式
	// //默认为方法名stringStore
	// public Store stringStore2(){
	// return new StringStore();
	// }

	// 测试泛型注入
	@Autowired
	private Store<String> s1;
	
	
	@Autowired
	private Store<Integer> s2;

	@Bean
	public StringStore stringSore() {
		return new StringStore();
	}

	@Bean
	public IntegerStore integerSore() {
		return new IntegerStore();
	}

	@Bean(name = "stringStoreTest")
	public Store stringStoreTest() {
		System.out.println("s1:" + s1.getClass().getName());
		System.out.println("s2:" + s2.getClass().getName());
		return new StringStore();
	}
}
