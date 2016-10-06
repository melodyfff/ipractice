package test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.beanannotation.jsr.JsrService;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午11:41:33 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJsr extends UnitTestBase{
	public TestJsr(){
		super("classpath:test-jsr.xml");
	}
	
	@Test
	public void testSave(){
		JsrService service = getBean("jsrService");
		service.save();
	}
}
