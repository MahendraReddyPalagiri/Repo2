package com.durgasoft.dao;

import org.springframework.stereotype.Repository;

import com.durgasoft.bean.Account;
@Repository("transactionDao")
public class TransactionDaoimpl implements TransactionDao {

	@Override
	public String transfer(Account acc, int transfer_Amount) {
		System.out.println("Account Details");
		System.out.println("Accountno:"+acc.getAccNo());
		System.out.println("AccountName:"+acc.getAccname());
		System.out.println("Account Salary:"+acc.getAccbal());
        System.out.println("Acccount Type:"+acc.getAccType());
		return null;
	}

}
