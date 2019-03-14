package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.dao.Transactiondao;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		 Transactiondao tdao=(Transactiondao)context.getBean("transactionDao");
	     tdao.transferFunds("111", "123", 5000);
	}

}
