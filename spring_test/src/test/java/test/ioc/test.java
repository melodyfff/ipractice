package test.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.xinchen.spring.ioc.service.InjectionService;

import test.base.UnitTestBase;

/**
 * @Description:
 * @author xinchen
 * @date 2016年10月5日 上午12:20:59
 * @version V1.0
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class test extends UnitTestBase {
	public test() {
		super("classpath:test-ioc.xml");
	}
	@Test
	public void tt(){
		InjectionService service = super.getBean("injectionService");
		service.save("这是要保存的数据");
	}
}
