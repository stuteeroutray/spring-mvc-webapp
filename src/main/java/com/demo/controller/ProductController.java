package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.domain.Product;
import com.demo.services.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping("/product/list")
	public String listProducts(Model model) {
		
		model.addAttribute("products",productService.listAllProducts());
		
		return "product/list";
	}
	
	@RequestMapping("/product/{id}")
	public String getProduct(@PathVariable Integer id, Model model) {
		
		model.addAttribute("product",productService.getProductById(id));
		
		return "product/show";
	}
	
    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
    	
        model.addAttribute("product", productService.getProductById(id));
        
        return "product/productform";
    }
    
	@RequestMapping("product/new")
	public String createProduct(Model model) {
		
		model.addAttribute("product", new Product());
		
		return "product/productform";
	}
	
	@RequestMapping(value="/product", method = RequestMethod.POST)
	public String saveOrUpdateProduct(Product product) {
		
		productService.saveOrUpdateProduct(product);
		
		return "redirect:/product/list";
	}
	
    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable Integer id){
        
    	productService.deleteProduct(id);
        
    	return "redirect:/product/list";
    }
}
