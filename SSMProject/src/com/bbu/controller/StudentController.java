package com.bbu.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bbu.entity.Student;
import com.bbu.service.StudentService;

@Controller
@RequestMapping("controller")
public class StudentController {
	@Autowired  //根据ioc容器中类型自动匹配
	@Qualifier("studentService") //根据ioc容器中bean的id匹配
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}




	@RequestMapping("queryStudentById/{sid}")
	public String queryStudentById(@PathVariable("sid") Integer sid,Map<String, Object> m) {
		
		Student student= studentService.queryStudentById(sid);
		m.put("student", student);
		
		return "result";
	}

}
