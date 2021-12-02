package com.g.IOCApplication.controller;

import com.g.IOCApplication.dto.CustomerDTO;
import com.g.IOCApplication.service.CustomerMgmtService;
import com.g.IOCApplication.vo.CustomerVO;

public class MainController {
	private CustomerMgmtService service;
	public MainController(CustomerMgmtService service) {
		this.service=service;
	}
	public String processCustomer(CustomerVO vo)throws Exception{
		CustomerDTO dto=null;
		String result=null;
		dto=new CustomerDTO();
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPamt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		result = service.calculateIntrestAmount(dto);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
