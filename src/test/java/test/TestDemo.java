package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.linc.cxf.interfaces.ServiceUI;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestDemo {
	@Autowired
	public ServiceUI serviceUi;

	@Test
	public void demo(){
		String  s = serviceUi.sayHello("凯迪拉克");
		System.out.println(s);
	}

}
