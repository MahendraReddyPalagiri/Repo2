package com.durgasoft.model;

import javax.validation.constraints.NotEmpty;
public class Register {
@NotEmpty
 private String uname;
private String upwd;
 private String uemail;
 private String umobile;
 
 
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUmobile() {
	return umobile;
}
public void setUmobile(String umobile) {
	this.umobile = umobile;
}
 
}
