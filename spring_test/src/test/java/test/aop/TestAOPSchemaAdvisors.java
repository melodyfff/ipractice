package test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.aop.schema.advisors.service.InvokeService;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 上午12:51:08
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPSchemaAdvisors extends UnitTestBase {
	public TestAOPSchemaAdvisors() {
		super("classpath:spring-aop-schema-advisors.xml");
	}
	
	@Test
	public void testSave(){
		InvokeService service = super.getBean("invokeService");
		service.Invoke();
		
		System.out.println();
		service.invokeException();
	}
	
}
