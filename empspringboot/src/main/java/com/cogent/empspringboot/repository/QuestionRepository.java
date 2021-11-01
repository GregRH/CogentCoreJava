package com.cogent.empspringboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.empspringboot.dto.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
