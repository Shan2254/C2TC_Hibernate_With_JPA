package com.cg.client;


import com.cg.entity.Student;
import com.cg.services.StudentService;
import com.cg.services.StudentServiceImpl;


public class Client {
	
	public static void main(String[] args) 
	{
		
		// CRUD operation calling activity
		Student student = new Student();
		
		StudentService service = new StudentServiceImpl();
		
		// Create Operation
		
		student.setStudentid(6);
		student.setName("Shantanu Joshi ");
		service.addStudent(student);
		
		
	// Retrieve Operation
	//	service.findStudentById(104);
		//System.out.println("ID is: "+student.getStudentid());
		//System.out.println("Name is: "+student.getName());
		
		
		
		//Update Operation
//		student  =service.findStudentById(1);
//		student.setName("Shantanu ");
//		service.updateStudent(student);
		
		
	/*	service.findStudentById(101);
		System.out.println("ID is: "+student.getStudentid());
		System.out.println("Name is: "+student.getName());
		
		
		// Delete Operation
		student=service.findStudentById(104);
		service.removeStudent(student);
		System.out.println("Row removed");*/
		
		System.out.println("End of program/Life cycle completed...");
	}


}
