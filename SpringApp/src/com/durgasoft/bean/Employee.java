package com.durgasoft.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Employee {
 private int eno;
 private String ename;
 private float esal;
 private String eaddr;
  @Autowired
 private Account acc;
  public void m1() {
	  System.out.println("Employee Bean Initilization");
  }
  public  void m2() {
	  System.out.println("Employee Bean destruction");
  }
 

public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getEsal() {
	return esal;
}
public void setEsal(float esal) {
	this.esal = esal;
}
public String getEaddr() {
	return eaddr;
}
public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}
 
 
 public void getEmployeeDetails() {
	System.out.println("Employee Details");
	System.out.println("------------------------------------");
	System.out.println("Employee Number:"+eno);
	System.out.println("Employee Name;"+ename);
    System.out.println("Employee Salary:"+esal);
    System.out.println("Employee Address:"+eaddr);
    System.out.println("Account Details");
    System.out.println("----------------------");
    System.out.println("Account No:"+acc.getAccNo());
    System.out.println("Account Name;"+acc.getAccName());
    System.out.println("Account Balance:"+acc.getAccBal());
    System.out.println("Account Type;"+acc.getAccType());
 }
 
 
 
}
