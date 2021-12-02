package com.cogent.employee_registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.employee_registration.bo.EmployeeBO;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeBO, String> {

}
