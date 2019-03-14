package com.durgasoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {
	@Id
	@Column(name="ENO")
 private String eno;
	@Column(name="ENAME")
 private String ename;
	@Column(name="ESAL")
 private float esal;
	@Column(name="EADDR")
 private String eaddr;
public String getEno() {
	return eno;
}
public void setEno(String eno) {
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
 
}
