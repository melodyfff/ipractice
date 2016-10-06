package test.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午1:51:08
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
	public TestAware() {
		super("classpath:spring-aware.xml");
	}

	@Test
	public void testMyApplicationContext(){
		System.out.println("测试类-----MyApplicationContext:"+super.getBean("myApplicationContext").hashCode());
	}
	
	@Test
	public void testBeanName(){
		System.out.println("testBeanName:"+super.getBean("beanName").hashCode());
	}
}
