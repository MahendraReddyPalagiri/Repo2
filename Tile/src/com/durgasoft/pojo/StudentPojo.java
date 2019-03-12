package com.durgasoft.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentPojo {
 @Id
 @Column(name="SID",length=20)
 private String sid;
 @Column(name="SNAME",length=30)
 private String sname;
 @Column(name="SADDR",length=25)
 private String saddr;
 
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}
 
 
 
}
