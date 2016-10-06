package com.xinchen.spring.beanannotation.javabased;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午9:29:04
 * @version V1.0
 */
public class MyDriverManager {
	public MyDriverManager(String url, String userName, String password) {
		System.out.println("url:" + url);
		System.out.println("userName:" + userName);
		System.out.println("password:" + password);
	}
}
