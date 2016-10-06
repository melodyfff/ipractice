package test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.bean.BeanScope;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 上午12:50:15 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{
	public TestBeanScope(){
		super("classpath*:test-bean.xml");
	}
	@Test
	public void testSay(){
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
	}
}
