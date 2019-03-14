package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.bean.Employee;
import com.durgasoft.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao empdao=(EmployeeDao)context.getBean("empDao");
		Employee emp=new Employee();
		emp.setEno(111);
		String status=empdao.deleteEmployee(emp);
		System.out.println(status);
	   
	}

}
