package com.xinchen.mvc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.util.Date;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * @Description:
 * @author xinchen 2016年10月16日 下午2:39:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({
		// "file:src/main/webapp/WEB-INF/config/spring-servlet.xml",
		"classpath*:spring-servlet-test.xml" })
public class IndexControllerTest {
	private static final Log log = LogFactory.getLog(IndexControllerTest.class);
	@Autowired
	private IndexController indexController;
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mocMvc;
	
	private MockHttpServletRequest request;

	@Before
	public void before() {
		request = new MockHttpServletRequest();
		this.mocMvc = webAppContextSetup(this.wac).build();
	}

	@Test
	public void hello() throws Exception {
		this.mocMvc.perform(get("/hello")).andExpect(status().isOk()).andDo(print());
		log.info(status().toString());
	}

	@Test
	public void person1() throws Exception {
		this.mocMvc.perform(post("/person").param("name", "sam").param("age", "11")).andExpect(status().isOk())
				.andExpect(view().name("hello")).andDo(print());
		log.info(status().toString());
	}
	@Test
	public void person2() throws Exception {
		this.mocMvc.perform(post("/person1").param("name", "sam").param("age", "11")).andExpect(status().isOk())
		.andExpect(view().name("hello")).andDo(print());
		log.info(status().toString());
	}
	@Test
	public void date() throws Exception {
		Date date = mock(Date.class);
//		this.mocMvc.perform(post("/date").param("date", new Date())).andExpect(status().isOk())
//		.andExpect(view().name("hello")).andDo(print());
//		log.info(status().toString());
		request.getSession().setAttribute("date", date);
		indexController.date(request);
	}
}
