package org.joedayz.corespringtest.web.controller;

import java.math.BigDecimal;
import java.util.List;


import org.joedayz.corespringtest.model.Category;
import org.joedayz.corespringtest.model.Product;
import org.joedayz.corespringtest.service.ProductManager;
import org.joedayz.corespringtest.web.validator.ProductValidator;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

//TODO
public class ProductController {
	
	//TODO
	private ProductManager productManager;
	
	//TODO
	private ProductValidator productValidator;
	
	//TODO
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(BigDecimal.class, new CustomNumberEditor(BigDecimal.class, true));
	}
	
	@RequestMapping("/inicio.htm")
	public void inicio() {
	}

	@RequestMapping("TODO")
	public void productList(Model model, 
                                    /*TODO*/Product product) {
		
		//TODO
		List<Product> products = null;
		model.addAttribute("products", null);
		model.addAttribute("product", null);

	}

	@RequestMapping(value = "TODO", method = RequestMethod.GET)
	public /*TODO*/Product productView(/*TODO*/Integer idProduct) {

		if (idProduct != null) {
			
			//TODO			
			Product product = null;
			return null;
		}
		return new Product();
	}

	@RequestMapping(value = "TODO", method = RequestMethod.POST)
	public String saveProduct(/*TODO*/Product product,
			BindingResult result, SessionStatus status) {

		try {
			
			//TODO
			return "TODO";
			
		} catch (Exception e) {
			
			//TODO
			return "TODO";
		}
	}

	@RequestMapping("TODO")
	public String deleteProduct(Integer idProduct) {

		//TODO
		return "TODO";
	}
	
	@ModelAttribute("categoriesTypes")
	public List<Category> categoryList() {

		//TODO
		List<Category> categoriesTypes = null;
		return null;
	}
}
