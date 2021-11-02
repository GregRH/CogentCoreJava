package com.cogent.productexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.productexample.dto.Product;
import com.cogent.productexample.service.ProductService;


//@RestController
public class ProductController {
	/*@GetMapping
	 * @PostMapping
	 * @PutMapping
	 * @DeleteMapping*/
	@Autowired
	ProductService productService;
	
//@GetMapping("/")	
//	public List<Product> retrieveAllProducts(){
//		List<Product> prodList = productService.findAllProducts();
//		System.out.println("List is "+prodList);
//		prodList.stream().forEach(System.out::println);
//		System.out.println("Coming here");
//		return prodList;
//	}
//	@GetMapping("/product/{id}")
//	public ResponseEntity<Product> retriveStudent(@PathVariable int id)throws ResourceNotFoundException{
//		Product p1 = productService.findById(id);
//		return ResponseEntity.ok().body(p1);
//	}
//	@DeleteMapping("/products/{id}")
//	public void deleteStudent(@PathVariable int id) {
//		productService.deleteData(id);
//	}
//	@PostMapping("/product")
//	public ResponseEntity<Object>
//	createStudent(@RequestBody Product product) {
//		productService.insertProduct(product);
////http://localhost:8080/product/11
//		URI location = 
//			ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//				.buildAndExpand(product.getProductCode()).toUri();
////it is changing the uri from current location to location http://localhost:8080/product/11
//		return ResponseEntity.created(location).build();
//
//	}
//	
//	@PutMapping("/product/{id}")
//	public ResponseEntity<Object> updateProduct(@RequestBody Product product,@PathVariable int id) throws ResourceNotFoundException{
//		Optional<Product> p1 = Optional.ofNullable(productService.findById(id));
//		if(p1.isPresent())
//			productService.updateData(id, product);
//		return(ResponseEntity.ok(product));
//	}
	
	
}
