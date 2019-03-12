package com.durgasoft.dao;

import com.durgasoft.model.Student;
import com.durgasoft.pojo.StudentPojo;

public interface StudentDao {
 public String add(StudentPojo studentPojo);
 public StudentPojo search(String sid);
 public String update(StudentPojo studentPojo);
 public String delete(StudentPojo studentPojo);
 
}
