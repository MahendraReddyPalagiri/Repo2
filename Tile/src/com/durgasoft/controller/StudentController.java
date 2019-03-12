package com.durgasoft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.durgasoft.model.Student;
import com.durgasoft.pojo.StudentPojo;
import com.durgasoft.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(value ="welcome", method = RequestMethod.GET)
	public String showLayout() {
		return "welcomeDef";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView showaddForm() {
		return new ModelAndView("addDef", "student", new Student());
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(Student student) {
		String status = "";
		status = studentService.addStudent(student);
		return new ModelAndView("statusDef", "status", status);
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public ModelAndView showSearchForm() {
		return new ModelAndView("searchDef", "student", new Student());
	}

	@RequestMapping(value = "search", method = RequestMethod.POST)
	public ModelAndView search(Student student) {
		student = studentService.searchStudent(student.getSid());
		if (student == null) {
			return new ModelAndView("statusDef", "status", "Student Not Existed");
		} else {
			return new ModelAndView("StudentDetailsDef", "student", student);
		}
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView showUpdateForm() {
		return new ModelAndView("updateDef", "student", new Student());
	}

	@RequestMapping(value = "getEditForm", method = RequestMethod.POST)
	public ModelAndView getEditForm(Student student) {
		student = studentService.searchStudent(student.getSid());
		if (student == null) {
			return new ModelAndView("statusDef", "status", "Student Not Existed");
		} else {
			return new ModelAndView("editDef", "student", student);
		}
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(@RequestParam String sid, @RequestParam String sname, @RequestParam String saddr) {
		Student student = new Student();
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddr(saddr);
		String status = studentService.updateStudent(student);
		if (status.equals("success")) {
			return new ModelAndView("statusDef", "status", "Student Updation Success");
		} else {
			return new ModelAndView("statusDef", "status", "Student Updation Failure");
		}
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView showDeleteForm() {
		return new ModelAndView("deleteDef", "student", new Student());
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public ModelAndView delete(Student student) {
		String status = studentService.deleteStudent(student);
		if (status.equals("success")) {
			return new ModelAndView("statusDef", "status", "Student Deletion Success");
		}
		if (status.equals("notexisted")) {
			return new ModelAndView("statusDef", "status", "Student Not Existed");
		} else {
			return new ModelAndView("statusDef", "status", "Student Deletion Failure");
		}
	}
}
