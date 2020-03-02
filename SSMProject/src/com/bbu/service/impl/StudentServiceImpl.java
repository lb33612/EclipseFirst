package com.bbu.service.impl;

import com.bbu.entity.Student;
import com.bbu.mapper.StudentMapper;
import com.bbu.service.StudentService;

public class StudentServiceImpl implements StudentService{

//service“¿¿µ”ÚDao
	StudentMapper studentMapper;
	
	
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}



	@Override
	public Student queryStudentById(int sid) {
		
		return studentMapper.queryStudentById(sid);
	}

}
