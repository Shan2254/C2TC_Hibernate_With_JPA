//Entity Class
package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Information to the program about the database table
@Entity
@Table (name="student")
public class Student implements Serializable 
{
	private static final long serialVersionUID=1L;
	@Id
	private int studentId;
	private String name;

	public int getStudentid() {
		return studentId;
	}

	public void setStudentid(int studentid) {
		this.studentId = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
