package com.classes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String teacherName;
	private long salary;
	private int workingHours;
	private long contact;
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	
	
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
//	public Teacher(String teacherName, long salary, int workingHours) {
//		super();
//		this.teacherName = teacherName;
//		this.salary = salary;
//		this.workingHours = workingHours;
		
//	}
	
	
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", salary=" + salary
				+ ", workingHours=" + workingHours + ", contact=" + contact + "]";
	}
public Teacher(String teacherName, long salary, int workingHours, long contact) {
	super();
	this.teacherName = teacherName;
	this.salary = salary;
	this.workingHours = workingHours;
	this.contact = contact;
}
	
	
	
	
	
	
}

