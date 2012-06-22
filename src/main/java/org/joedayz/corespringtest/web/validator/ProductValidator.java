package org.joedayz.corespringtest.web.validator;

import org.joedayz.corespringtest.model.Product;
import org.joedayz.corespringtest.service.ProductManager;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//TODO
public class ProductValidator implements Validator{

	//TODO
	private ProductManager productManager;
		
	@SuppressWarnings("rawtypes")
	public boolean supports(Class clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object object, Errors errors) {
		
		Product product = (Product)object;
		
		//TODO
		boolean isRepeatName = productManager.isRepeatDescription(null, null);
		if(isRepeatName){
			errors.rejectValue("name", "product.name.isRepeat");		
		}
	}

}
