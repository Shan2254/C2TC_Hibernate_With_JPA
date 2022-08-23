package com.cg.services;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entity.Student;
import com.cg.services.*;

public class StudentServiceImpl implements StudentService {
	
	private StudentDaoImpl dao;

	public StudentServiceImpl() 
	{
		dao = new StudentDaoImpl();
	}

	public void addStudent(Student student) 
	{
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}
	public Student findStudentById(int id)
	{
		Student student = dao.getStudentById(id);
		return student;
	}

	public void updateStudent(Student student) 
	{
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	public void removeStudent(Student student) 
	{
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

}
