package test.resource;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.resource.MyResource;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午3:14:23 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestMyResource extends UnitTestBase{
	public TestMyResource(){
		super("classpath:spring-resource.xml");
	} 
	@Test
	public void testResource() throws IOException{
		MyResource resource = super.getBean("myResource");
		resource.resource();
	}
}
