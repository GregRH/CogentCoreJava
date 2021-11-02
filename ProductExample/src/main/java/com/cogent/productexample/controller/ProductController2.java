package com.cogent.productexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cogent.productexample.dto.Product;
import com.cogent.productexample.exception.ResourceNotFoundException;
import com.cogent.productexample.service.ProductService;
@Controller
public class ProductController2 {
	@Autowired
	ProductService productService;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listProduct", productService.findAllProducts());
		return "index";
	}
	@GetMapping("/showNewProductForm")
	public String showNewProduce(Model model) {
		System.out.println("Coming here");
		Product product = new Product();
		model.addAttribute("product", product);
		return "new_product";
	}
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product")Product product) {
		productService.insertProduct(product);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id")int id,Model model) throws ResourceNotFoundException {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "update_product";
	}
	 @GetMapping("/deleteProduct/{id}")
	    public String deleteEmployee(@PathVariable(value = "id") int id) {

	        // call delete employee method 
	        productService.deleteData(id);
	        return "redirect:/";
	    }
}
