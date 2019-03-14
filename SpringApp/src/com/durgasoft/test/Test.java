package com.durgasoft.test;

import java.beans.IntrospectionException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.bean.Employee;

public class Test {
	
      public static void main(String[] args) throws IntrospectionException {
      AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      Employee employee=(Employee) context.getBean("empBean");
      employee.getEmployeeDetails();
      context.registerShutdownHook();
      
     
     
	}

}
