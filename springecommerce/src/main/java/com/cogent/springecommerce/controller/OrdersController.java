package com.cogent.springecommerce.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cogent.springecommerce.dto.Orders;
import com.cogent.springecommerce.exception.InvalidIdException;
import com.cogent.springecommerce.service.OrdersService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value="OrdersController",
description = "Rest api related to Orders")
@RestController
public class OrdersController {
	@Autowired
	OrdersService ordersService;
	
	@ApiOperation(value="Get list of Orders in the System",
			response = Iterable.class,
			tags = "Orders")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/Orders")
	public List<Orders> getOrders(){
		
		return (ordersService.getAllOrders()).get();
		
	}
	@ApiOperation(value="Get one Orders in the System",
			response = ResponseEntity.class,
			tags = "Orders")
	@GetMapping("/Orders/{id}")
	public ResponseEntity<Orders> getSingleOrder(@PathVariable String id) throws InvalidIdException {
		Orders o = ordersService.getOrdersById(id).orElseThrow(()->new InvalidIdException("Invalid id " +id));
		return ResponseEntity.ok().body(o);
	}
	@ApiOperation(value="Add new Orders to the System",
			response = ResponseEntity.class,
			tags = "newOrder")
	@PostMapping("/newOrder")
	public ResponseEntity<Object> addOrder(@RequestBody Orders order){
		ordersService.addOrders(order);
		URI location = 
				ServletUriComponentsBuilder.fromCurrentRequest().path("/Orders/{id}")
					.buildAndExpand(order.getOrderID()).toUri();
		return ResponseEntity.created(location).build(); 
	}
	@ApiOperation(value="Update existing Orders in the System",
			response = ResponseEntity.class,
			tags = "Orders")
	@PutMapping("/Orders/{id}")
	public ResponseEntity<Orders> updateOrders(@PathVariable String id, @RequestBody Orders order){
		if(ordersService.getOrdersById(id).isEmpty())throw new InvalidIdException("invalid id");
		ordersService.updateOrders(id, order);
		return ResponseEntity.ok(order);
	}
	@ApiOperation(value="Delete Orders in the System",
			tags = "Orders")
	@DeleteMapping("/Orders/{id}")
	public void deleteOrder(@PathVariable String id){
		ordersService.deleteOrdersById(id);
	}
	
}
