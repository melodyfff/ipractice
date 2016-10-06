package test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.aop.schema.advice.Fit;
import com.xinchen.spring.aop.schema.advice.biz.AspectBiz;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 上午12:51:08
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvice extends UnitTestBase {
	public TestAOPSchemaAdvice() {
		super("classpath:spring-aop-schema-advice.xml");
	}
	
	@Test
	public void testBiz(){
		AspectBiz biz = super.getBean("aspectBiz");
		biz.biz();
	}
	@Test
	public void testInit(){
		AspectBiz biz = super.getBean("aspectBiz");
		biz.init("xinchen", 6);
	}
	@Test
	public void testFit(){
		Fit fit = (Fit)super.getBean("aspectBiz");
		fit.filter();
	}
	
}
