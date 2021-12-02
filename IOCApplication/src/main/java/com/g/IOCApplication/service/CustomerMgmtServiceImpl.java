package com.g.IOCApplication.service;

import com.g.IOCApplication.bo.CustomerBO;
import com.g.IOCApplication.dao.CustomerDAO;
import com.g.IOCApplication.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	private CustomerDAO dao;
	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}
	public String calculateIntrestAmount(CustomerDTO dto) throws Exception {
		// TODO Auto-generated method stub
		float intrAmt=0.0f;
		CustomerBO bo=null;
		int count=0;
		
		intrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		bo=new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntramt(intrAmt);
		count=dao.insert(bo);
		if(count==0)
			return "Customer Registration failled :: Amt::"+dto.getPamt()+" "
					+"intrest"+intrAmt;
		else
			return "Customer Registration succeded :: Amt::"+dto.getPamt()+" "
			+"intrest"+intrAmt;
	}

}
