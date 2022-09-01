package com.komal.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.komal.task.Service.ProductService;
import com.komal.task.model.Product;

@RestController  
public class productcontroller {
	@Autowired  
	ProductService productService;  
	  
	@GetMapping("/product")  
	private List<Product> getAllproduct()   
	{  
	return productService.getAllproduct();  
	}  
	  
	@GetMapping("/product/{id}")  
	private Product getProduct(@PathVariable("id") int id)   
	{  
	return productService.getproductById(id);  
	}  
	  
	@DeleteMapping("/product/{id}")  
	private void deleteproduct(@PathVariable("id") int id)   
	{  
		productService.delete(id);  
	}  
	  
	@PostMapping("/product")  
	private int saveBook(@RequestBody Product product)   
	{  
		productService.saveOrUpdate(product);  
	return product.getId();  
	}  
	  
	@PutMapping("/product")  
	private Product update(@RequestBody Product product)   
	{  
		productService.saveOrUpdate(product);  
	return product;  
	}  
}
