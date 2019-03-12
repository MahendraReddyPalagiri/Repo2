package com.durgasoft.service;

import com.durgasoft.model.Student;
import com.durgasoft.pojo.StudentPojo;

public interface StudentService {
public String addStudent(Student student);
public Student searchStudent(String sid);
public String updateStudent(Student student);
public String deleteStudent(Student student);
 }
