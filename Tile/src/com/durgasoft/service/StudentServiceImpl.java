package com.durgasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durgasoft.dao.StudentDao;
import com.durgasoft.model.Student;
import com.durgasoft.pojo.StudentPojo;
@Service
public class StudentServiceImpl implements StudentService {
    String status="";
    @Autowired
    private StudentDao studentDao;
    @Override
	public String addStudent(Student student) {
		StudentPojo studentPojo=new StudentPojo();
		studentPojo.setSid(student.getSid());
		studentPojo.setSname(student.getSname());
		studentPojo.setSaddr(student.getSaddr());
		status=studentDao.add(studentPojo);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
		StudentPojo studentPojo=studentDao.search(sid);
		Student student=new Student();
		if (studentPojo==null) {
		   student=null;
		}else {
			student.setSid(studentPojo.getSid());
			student.setSname(studentPojo.getSname());
			student.setSaddr(studentPojo.getSaddr());
		}
		return student;
	}

	@Override
	public String updateStudent(Student student) {
		StudentPojo studentPojo=new StudentPojo();
		studentPojo.setSid(student.getSid());
		studentPojo.setSname(student.getSname());
		studentPojo.setSaddr(student.getSaddr());
		status=studentDao.update(studentPojo);
		return status;
	}

	@Override
	public String deleteStudent(Student student) {
		StudentPojo studentPojo=new StudentPojo();
		studentPojo.setSid(student.getSid());
		String status=studentDao.delete(studentPojo);
		return status;
	}

}
