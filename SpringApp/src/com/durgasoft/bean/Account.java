package com.durgasoft.bean;

public class Account {
 private int accNo;
 private String accName;
 private int accBal;
 private String accType;
 
 public void m1() {
	  System.out.println("AccoountBean Initilization");
 }
 public  void m2() {
	  System.out.println("AccountBean destruction");
 }
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getAccName() {
	return accName;
}
public void setAccName(String accName) {
	this.accName = accName;
}
public int getAccBal() {
	return accBal;
}
public void setAccBal(int accBal) {
	this.accBal = accBal;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
 
 
 
}
