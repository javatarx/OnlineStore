package org.joedayz.corespringtest.dao.impl;

import java.util.List;

import org.joedayz.corespringtest.dao.ProductDao;
import org.joedayz.corespringtest.model.Category;
import org.joedayz.corespringtest.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

//TODO
public class ProductDaoImpl implements ProductDao {
			
	private HibernateTemplate hibernateTemplate;
	private JdbcTemplate jdbcTemplate;
	
	//TODO
	public ProductDaoImpl() {	
		
		this.hibernateTemplate = null; //TODO
		this.jdbcTemplate = null; //TODO
	}

	public void deleteProduct(Integer idProduct) {	
		
		Product product = getProductById(idProduct);
		//TODO
	}

	public Product getProductById(Integer idProduct) {
		Product product = null; //TODO
		return product;
	}

	public List<Product> getProductsList(Product product) {			
		
		StringBuffer query = new StringBuffer(" from Product ");
		
		if(product != null 
				&& product.getName() != null 
				&& product.getName().length() > 0){
			
			//TODO
			String filter = null;			
			query.append(" where upper(name) like '%").append(filter.toUpperCase()).append("%' ");
		}
		
		//TODO
		List<Product> list = null;
		return list;
	}

	public void saveProduct(Product product) {	
		//TODO
	}
	
	public List<Category> getCategoriesTypesList() {
		
		StringBuffer query = new StringBuffer("from Category");
		
		//TODO
		return null;
	}	
	
	public boolean isRepeatDescription(String name, Integer idProduct){
		
		StringBuffer query = new StringBuffer();
		query.append("select count(*) from product ");
		query.append(" where upper(trim(name)) = '").append(name.trim().toUpperCase()).append("' ");
		
		if(idProduct != null){
			query.append(" and id_product != ").append(idProduct);
		}		

		//TODO
		int count = -1;
		if(count > 0){
			return true;
		}
		return false;			
	}
}