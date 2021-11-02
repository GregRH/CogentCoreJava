package com.cogent.deptemployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.deptemployee.dto.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

}
