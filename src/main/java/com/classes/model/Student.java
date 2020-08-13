package com.classes.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String name;
	private long contact;
	private String gender;
	@ManyToOne
	private Class classes;
	
	@ManyToMany(targetEntity = Subject.class, cascade = { CascadeType.ALL })  
	@JoinTable(name = "stub_subj",   
               joinColumns  = {@JoinColumn(name = "StudentId")},
               inverseJoinColumns = { @JoinColumn(name = "SubjectId") })  
	private Set<Subject> Subjects = new HashSet<Subject>();
	
	
	
//	public List<Subject> getSubjList() {
//		return subjList;
//	}
//	public void setSubjList(List<Subject> subjectList) {
//		this.subjList = subjectList;
//	}
	
	public Set<Subject> getSubjects() {
		return Subjects;
	}

	public void setSubjects(Set<Subject> subjects) {
		Subjects = subjects;
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Student(String name, long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}

	
	

	public Student(String name, long contact, String gender) {
		super();
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", contact=" + contact + ", gender=" + gender
				+ ", classes=" + classes + ", Subjects=" + Subjects + "]";
	}

	public Student(String name, long contact, Class classes) {
		super();
		this.name = name;
		this.contact = contact;
		this.classes = classes;
	}

	public Student(String name, long contact, Class classes, Set<Subject> subjects) {
		super();
		this.name = name;
		this.contact = contact;
		this.classes = classes;
		Subjects = subjects;
	}
	
//	public Student(int studentId, String name, long contact, List<Subject> subjectList) {
//		super();
//		this.studentId = studentId;
//		this.name = name;
//		this.contact = contact;
//		this.subjList = subjectList;
//	}

	
//	@Override
//	public String toString() {
//		return "Student [studentId=" + studentId + ", name=" + name + ", contact=" + contact + ", classes=" + classes
//				+ ", subjectList=" + subjList + "]";
//	}
//	public Student(int studentId, String name, long contact, Class classes, List<Subject> subjectList) {
//		super();
//		this.studentId = studentId;
//		this.name = name;
//		this.contact = contact;
//		this.classes = classes;
//		this.subjList = subjectList;
//	}
//	public void setSubject(Subject sub1) {
//		// TODO Auto-generated method stub
//		
//	}

	
	
	
	
	
	
}