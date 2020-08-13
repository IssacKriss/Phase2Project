package com.classes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classId;
	private String classname;
	
	@OneToMany(mappedBy = "classes",fetch = FetchType.EAGER)
	private List<Student> studentList=new ArrayList<>();
	
	
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public Class() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Class(String classname, List<Student> studentList) {
		super();
		this.classname = classname;
		this.studentList = studentList;
	}
	
	
	@Override
	public String toString() {
		return "Class [classId=" + classId + ", classname=" + classname + ", studentList=" + studentList
				+ "]";
	}
	
	
	
}
