package com.nt.entity;

public class BankAccount {
	private long acno;
	private String holderName;
	private float balance;
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", holderName=" + holderName + ", balance=" + balance + "]";
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}
