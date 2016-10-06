package test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.aop.aspectj.biz.MyBiz;

import test.base.UnitTestBase;



@RunWith(BlockJUnit4ClassRunner.class)
public class TestAspectJ extends UnitTestBase {
	
	public TestAspectJ() {
		super("classpath:spring-aop-aspectj.xml");
	}
	
	@Test
	public void test() {
		MyBiz biz = getBean("myBiz");
		biz.save("This is test.");
	}
	
}
