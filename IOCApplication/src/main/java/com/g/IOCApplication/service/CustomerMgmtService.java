package com.g.IOCApplication.service;

import com.g.IOCApplication.dto.CustomerDTO;

public interface CustomerMgmtService {
	public String calculateIntrestAmount(CustomerDTO dto)throws Exception;
}
