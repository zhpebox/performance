package controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.performance.controller.ModuleController;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations={"classpath:conftest/spring*.xml"})    
public class TestModuleController {
	
	@Autowired
	ModuleController  c ;
	@Test
	public void testGetDataModules(){
		String result = c.getDataModule("15");
		System.out.println(result);
	}
	
//	@Test
//	public void testGetDataModule(){
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/test/resources/conf/spring*.xml"); 
//		ModuleController controller = applicationContext.getBean(com.performance.controller.ModuleController.class);
//		String result = controller.getDataModule("15");
//		System.out.println(result);
//	}
	
}
