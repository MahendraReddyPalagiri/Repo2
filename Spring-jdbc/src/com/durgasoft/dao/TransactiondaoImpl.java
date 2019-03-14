package com.durgasoft.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class TransactiondaoImpl extends JdbcDaoSupport implements Transactiondao {
    @Transactional
	@Override
	public void transferFunds(String fromacc, String toacc,int amount) {
		getJdbcTemplate().update("update account set accbal=accbal-"+amount);
		float f=100/0;
		

	}

}
