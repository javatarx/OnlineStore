package org.joedayz.corespringtest.test.product;


import java.util.List;

import org.joedayz.corespringtest.dao.ProductDao;
import org.joedayz.corespringtest.model.Product;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(TODO.class)
@ContextConfiguration(locations={"classpath:TODO/system-test-config.xml"})
public class ProductDaoTests {

	//TODO	
	private ProductDao productDao;
	
	//TODO	
	public void testGetProductsList(){		
		List<Product> list = null;
		assertNotNull(list);
	}
	
	//TODO
	public void testIsRepeatDescription(){		
		boolean isRepeatDescription = productDao.isRepeatDescription("  iPod Touch 32Gb   ", new Integer(1));
		assertEquals(true, isRepeatDescription);
	}
	
}
