package com.cogent.empspringboot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;    
 
@Entity  	
@Table(name="question")  
public class Question {    
  
	@Id   
	@GeneratedValue(strategy=GenerationType.AUTO)  
	private int id;    
private String qname;    
	
@OneToMany(cascade = CascadeType.ALL)  
@JoinColumn(name="qid")
List<Answer> answers;  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getQname() {  
    return qname;  
}  
public void setQname(String qname) {  
    this.qname = qname;  
}   //Name of Foreign key which is created in Answers table
//@OrderColumn(name="type")  

public List<Answer> getAnswers() {  
    return answers;  
}  
public void setAnswers(List<Answer> answers) {  
    this.answers = answers;  
}      
}  

