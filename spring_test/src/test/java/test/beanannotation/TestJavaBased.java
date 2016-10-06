package test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.beanannotation.javabased.MyDriverManager;
import com.xinchen.spring.beanannotation.javabased.Store;
import com.xinchen.spring.beanannotation.javabased.StringStore;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 下午8:33:05
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavaBased extends UnitTestBase {
	public TestJavaBased() {
		super("classpath:spring-annotation.xml");
	}
	
	@Test
	public void test(){
		Store store = super.getBean("bean");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void testMyDriverManager(){
		MyDriverManager manager = super.getBean("myDriverManager");
		System.out.println(manager.getClass().getName());
	}
	
	@Test
	public void testScope(){
		Store store = super.getBean("bean2");
		//System.out.println(store.getClass().hashCode());//类的hashCode是一致的
		System.out.println(store.hashCode());
		store = super.getBean("bean");
		//System.out.println(store.getClass().hashCode());
		System.out.println(store.hashCode());
	}
	
	@Test
	public void testG(){
		StringStore store = super.getBean("stringStoreTest");
	}
}
