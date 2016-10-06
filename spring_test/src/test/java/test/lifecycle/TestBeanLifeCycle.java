package test.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.lifecycle.BeanLifeCycle;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 上午1:20:27 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanLifeCycle extends UnitTestBase {
	public TestBeanLifeCycle(){
		super("classpath:spring-beanlife.xml");
	}
	@Test
	public void test(){
		BeanLifeCycle bean = super.getBean("beanLifeCycle");
	}
}
