package com.durgasoft.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.durgasoft.entity.Employee;

public class Test {

	public static void main(String[] args) {
	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("emp");
	 EntityManager manager=factory.createEntityManager();	 EntityTransaction transaction=manager.getTransaction();
	 transaction.begin();
     Employee employee=manager.find(Employee.class, "111");
           manager.remove(employee);
     
    transaction.commit();
    System.out.println("Employee upadted Successfully");
}

}
