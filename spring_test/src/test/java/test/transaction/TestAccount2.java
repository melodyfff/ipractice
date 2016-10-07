package test.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinchen.spring.transaction.proxy.AccountService;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月6日 下午11:34:05 
* @version V1.0   
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction-proxy.xml")
public class TestAccount2 {
	
	//注入代理类，代理类增强了
	//测试业务层
	// @Resource(name="accountService")
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
