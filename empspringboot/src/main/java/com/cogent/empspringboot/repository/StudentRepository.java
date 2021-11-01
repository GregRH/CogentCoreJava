package com.cogent.empspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.empspringboot.dto.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
