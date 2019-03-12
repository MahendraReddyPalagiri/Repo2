package com.durgasoft.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.durgasoft.pojo.StudentPojo;
@Repository
public class StudentDaoImpl implements StudentDao {
    String status="";
	@Autowired
    private HibernateTemplate template;
    @Transactional
    @Override
	public String add(StudentPojo studentPojo) {
       StudentPojo studentPojo2=(StudentPojo)template.get(StudentPojo.class, studentPojo.getSid());
		if (studentPojo2==null) {
	      String pkvalue=(String)template.save(studentPojo);
	      if (pkvalue==studentPojo.getSid()) {
			 status="Student Inserted Successfully";
		}else {
			status="Student Insertion Failure";
		}
		}else {
		status="Student Existed Already";	
		}
       return status;
	}

	@Override
	public StudentPojo search(String sid) {
		StudentPojo studentPojo=template.get(StudentPojo.class, sid);
		return studentPojo;
	}
     @Transactional
	@Override
	public String update(StudentPojo studentPojo) {
		  try {
			template.update(studentPojo);
			status="success";
		} catch (DataAccessException e) {
			status="failure";
			e.printStackTrace();
		}
		return status;
	}
    @Transactional
	@Override
	public String delete(StudentPojo studentPojo) {
		try {
			StudentPojo studentPojo2=template.get(StudentPojo.class, studentPojo.getSid());
			if (studentPojo2!=null) {
				template.delete(studentPojo);
				status = "success";
			}else {
				status="notexisted";
			}
		} catch (DataAccessException e) {
            status="failure";
			e.printStackTrace();
		}
		return status;
	}

}
