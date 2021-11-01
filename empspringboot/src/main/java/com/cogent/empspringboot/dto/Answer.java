package com.cogent.empspringboot.dto;

import javax.persistence.*;
@Entity  
@Table(name="answers")  
public class Answer {   
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
  
private int id;    
private String answername;    
private String postedBy;
@ManyToOne
private Question ques;
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  
public String getAnswername() {  
    return answername;  
}  
public void setAnswername(String answername) {  
    this.answername = answername;  
}  
public String getPostedBy() {  
    return postedBy;  
}  
public void setPostedBy(String postedBy) {  
    this.postedBy = postedBy;  
}

public Question getQues() {
	return ques;
}
public void setQues(Question ques) {
	this.ques = ques;
}      
}    


