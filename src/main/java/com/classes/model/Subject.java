package com.classes.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Subjects")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	private String subjectName;

//	@ManyToMany
//	List<Student> StudentList = new ArrayList<>();
	
	
	
//	public List<Student> getStudentList() {
//		return StudentList;
//	}
//
//
//	public void setStudentList(List<Student> studentList) {
//		StudentList = studentList;
//	}
 
	@ManyToMany(mappedBy = "Subjects", cascade = CascadeType.ALL)
   Set<Student> Students = new HashSet<Student>();


	public Set<Student> getStudents() {
		return Students;
	}


	public void setStudents(Set<Student> students) {
		Students = students;
	}


	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="T_id")
	private Teacher teacher;


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


//	public Student getSub() {
//		return sub;
//	}
//
//
//	public void setSub(Student sub) {
//		this.sub = sub;
//	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Subject(String subjectName, Set<Student> students, Teacher teacher) {
		super();
		this.subjectName = subjectName;
		Students = students;
		this.teacher = teacher;
	}


	public Subject(String subjectName, Teacher teacher) {
		super();
		this.subjectName = subjectName;
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", teacher=" + teacher + "]";
	}


//	public void setSubId(Student studid) {
//		
//		
//	}


//	public Subject(String subjectName, Teacher teacher) {
//		super();
//		this.subjectName = subjectName;
//		this.teacher = teacher;
	}


//	public Subject(String subjectName, Student sub, Teacher teacher) {
//		super();
//		this.subjectName = subjectName;
//		this.sub = sub;
//		this.teacher = teacher;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + ", sub=" + sub + ", teacher="
//				+ teacher + "]";
//	}
	
	
	
	
	
	
		
	

