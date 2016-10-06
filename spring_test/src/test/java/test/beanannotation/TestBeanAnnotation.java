package test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.beanannotation.BeanAnnotation;

import test.base.UnitTestBase;

/**   
* @Description: 
* @author xinchen   
* @date 2016年10月5日 下午4:12:07 
* @version V1.0   
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase{
	public TestBeanAnnotation(){
		super("classpath:spring-annotation.xml");
	}
	
	@Test
	public void testSay(){
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("this is a test");
		
		bean  = super.getBean("bean");
		bean.say("this is a test");
	}
	@Test
	public void testScope(){
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.myHashCode();
		
		bean  = super.getBean("beanAnnotation");
		bean.myHashCode();
	}
}
