package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.IStudentDAO;
import com.nt.dao.StudentDAOMysqlImpl;
import com.nt.dto.StudentDTO;

public class StudentMgmtServiceImpl implements IStudentMgmtService {
	private IStudentDAO dao;
	public StudentMgmtServiceImpl() throws Exception {
		System.out.println("servcie 0param");
		dao=new StudentDAOMysqlImpl();
	}
	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total=dto.getMarks1()+dto.getMarks2()+dto.getMarks3();
		float avg=total/3.0f;
		String result = null;
		if(dto.getMarks1()<35||dto.getMarks2()<35||dto.getMarks3()<35)
			result="fail";
		else if(avg<35)
			result="fail";
		else if(avg<50)
			result="third class";
		else if(avg<60)
			result="second class";
		else
			result="first class";
		
		StudentBO bo = new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		int count = dao.intsert(bo);
		return count==0?"Student registration failed":"Student registration succeded:: total"+total+" avg:: "+avg+" result::"+result;
	}

}
