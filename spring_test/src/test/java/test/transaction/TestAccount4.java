package test.transaction;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinchen.spring.transaction.annotation.AccountService;

/**   
* @Description: 基于注解的事务管理
* @author xinchen   
* @date 2016年10月6日 下午11:34:05 
* @version V1.0   
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-transaction-annotation.xml")
public class TestAccount4 {
	
	//测试业务层
	 @Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
