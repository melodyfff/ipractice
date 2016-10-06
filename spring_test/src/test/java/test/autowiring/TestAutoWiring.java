package test.autowiring;

import org.junit.Test;

import com.xinchen.spring.autowiring.AutoWiringService;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午2:48:51 
* @version V1.0   
*/
public class TestAutoWiring extends UnitTestBase{
	public TestAutoWiring(){
		super("classpath:spring-autowiring.xml");
	}
	@Test
	public void testSay(){
		AutoWiringService service = super.getBean("autoWiringService");
		service.say("this is a test");
	}
}
