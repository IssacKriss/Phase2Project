package com.classes.service;

import java.util.List;

import com.classes.exception.BussinessException;
import com.classes.model.Student;
import com.classes.model.Subject;
import com.classes.model.Teacher;

public interface ClassesService {

	public Class createClass(Class classes) throws BussinessException;
	public Class getClassById(int classId) throws BussinessException;
	public Class updateClass(Class classes) throws BussinessException;
	public void deleteClass(int classId) throws BussinessException;
	public List<Class> getAllClasses() throws BussinessException;
	
	public Student createStudent(Student student) throws BussinessException;
	public Student getStudentById(int studentId) throws BussinessException;
	public List<Student> getAllStudents() throws BussinessException;
	public Student updateStudent(Student student) throws BussinessException;
	public void removeStudent(int studentId) throws BussinessException ;
	
	public Subject createSubject(Subject subject) throws BussinessException;
	public Subject getSubjectById(int subjectId) throws BussinessException;
	public List<Subject> getAllSubjects() throws BussinessException;
	public Subject updateSubject(Subject subject) throws BussinessException;
	public void removeSubject(int subjectId) throws BussinessException;
	
	
	public Teacher createTeacher(Teacher teacher) throws BussinessException;
	public Teacher getTeacherById(int teacherId) throws BussinessException;
	public List<Teacher> getAllTeachers() throws BussinessException;
	public Teacher updateTeacher(Teacher teacher) throws BussinessException;
	public void removeTeacher(int teacherId) throws BussinessException;
	
	
	
		
	
}
