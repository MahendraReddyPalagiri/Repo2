package com.durgasoft.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.durgasoft.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
    String status="";
	private HibernateTemplate template;
   public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
    @Transactional
	@Override
	public String insertEmployee(Employee emp) {
		  Employee employee=template.get(Employee.class, emp.getEno());
          if (employee==null) {
        	  int pkvalue=(int) template.save(emp);
              if (pkvalue==emp.getEno()) {
     			status="success";
     		}else {
     			status="failure";
     		}
              
     		
     	}else {
	status="existed";
}
          return status;
	}
		 

	@Override
	public Employee searchEmployee(int eno) {
		 Employee emp=template.get(Employee.class, eno);
		 
		return emp;
	}
    @Transactional
	@Override
	public String updateEmployee(Employee emp) {
        
			
			template.update(emp);
            status="success";
		
    	return status;
	}
    @Transactional
	@Override
	public String deleteEmployee(Employee emp) {
		template.delete(emp);
		status="success";
		return status;
	}

}
