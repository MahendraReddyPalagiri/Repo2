package com.durgasoft.dao;

import org.springframework.stereotype.Repository;

import com.durgasoft.bean.Account;
@Repository
public interface TransactionDao {
 public String transfer(Account acc,int transfer_Amount);
}
