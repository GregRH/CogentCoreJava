package com.g.beans;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	static {
		 System.out.println("WishMessageGenerator::static block");
	}
	public WishMessageGenerator() {
		System.out.println("WishGenerator::0-param constructor");
	}
	public void setDate26(Date date) {
		System.out.println("WishMessageGenerator.setDate");
		this.date=date;
	}
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWish "+date);
		int hour = date.getHours();
		if(hour<12) {
			return "good morning "+ user;
		}
		else if(hour < 16){
			return "good afternoon::"+user;
		}
		else if(hour<20) {
			return "good evening::"+user;
		}
		else
			return "good night::"+user;
	}
}
