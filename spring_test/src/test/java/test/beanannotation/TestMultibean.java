package test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.beanannotation.multibean.BeanInvoker;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午4:50:12 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestMultibean extends UnitTestBase{
	public TestMultibean(){
		super("classpath:spring-annotation.xml");
	}

	@Test
	public void testMultibean(){
		BeanInvoker invoker = super.getBean("beanInvoker");
		invoker.say();
	}
}
