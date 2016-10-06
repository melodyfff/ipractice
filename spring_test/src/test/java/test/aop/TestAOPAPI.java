package test.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.aop.api.BizLogic;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月6日 上午12:51:08
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAOPAPI extends UnitTestBase {
	public TestAOPAPI() {
		super("classpath:spring-aop-api.xml");
	}
	
	@Test
	public void testSave(){
		BizLogic logic = (BizLogic)super.getBean("bizLogicImpl");
		logic.save();
	}

	
}
