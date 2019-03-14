package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.bean.Account;
import com.durgasoft.dao.TransactionDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TransactionDao transactionDao=(TransactionDao)context.getBean("transactionDao");
	    Account acc=(Account)context.getBean("account");
		transactionDao.transfer(acc, 50000);
	}

}
