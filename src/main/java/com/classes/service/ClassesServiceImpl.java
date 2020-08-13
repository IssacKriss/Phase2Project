package com.classes.service;

import java.util.List;

import com.classes.dao.ClassesDAO;
import com.classes.dao.impl.ClassesDAOImpl;
import com.classes.exception.BussinessException;
import com.classes.model.Student;
import com.classes.model.Subject;
import com.classes.model.Teacher;

public class ClassesServiceImpl implements ClassesService {

	private ClassesDAO dao = new ClassesDAOImpl();
	
	@Override
	public Class createClass(Class classes) throws BussinessException {
		return dao.createClass(classes);
	}

	@Override
	public Class getClassById(int classId) throws BussinessException {
		if (classId <= 0) {
			throw new BussinessException("The classId cannot be Zero or Negative. Please supply the right classId.");
		}
		Class classes = dao.getClassById(classId);
		if (classes == null) {
			throw new BussinessException(
					"The class with classId '" + classId + "' does not exist. Please supply the right classId");
		}
		return classes;

	}

	@Override
	public Class updateClass(Class classes) throws BussinessException {
		return dao.updateClass(classes);
	}

	@Override
	public void deleteClass(int classId) throws BussinessException {
		dao.deleteClass(classId);
		
	}

	@Override
	public List<Class> getAllClasses() throws BussinessException {
		return dao.getAllClasses();
	}

	@Override
	public List<Subject> getAllSubjects() throws BussinessException {
		return dao.getAllSubjects();
	}

	@Override
	public List<Teacher> getAllTeachers() throws BussinessException {
		return dao.getAllTeachers();
	}

	@Override
	public List<Student> getAllStudents() throws BussinessException {
		return dao.getAllStudents();
	}

	@Override
	public Student createStudent(Student student) throws BussinessException {
		return dao.createStudent(student);
	}

	@Override
	public Student getStudentById(int studentId) throws BussinessException {
		if (studentId <= 0) {
			throw new BussinessException("The studentId cannot be Zero or Negative. Please supply the right studentId.");
		}
		Student student = dao.getStudentById(studentId);
		if (student == null) {
			throw new BussinessException(
					"The student with studentId '" + studentId + "' does not exist. Please supply the right studentId");
		}
		return student;
	}

	@Override
	public Student updateStudent(Student student) throws BussinessException {
		return dao.updateStudent(student);
	}

	@Override
	public void removeStudent(int studentId) throws BussinessException {
		dao.removeStudent(studentId);
		
	}

	@Override
	public Subject createSubject(Subject subject) throws BussinessException {
		return dao.createSubject(subject);
	}

	@Override
	public Subject getSubjectById(int subjectId) throws BussinessException {
		if (subjectId <= 0) {
			throw new BussinessException("The subejctId cannot be Zero or Negative. Please supply the right subjectId.");
		}
		Subject subject = dao.getSubjectById(subjectId);
		if (subject == null) {
			throw new BussinessException(
					"The subject with subjectId '" + subjectId + "' does not exist. Please supply the right subjectId");
		}
		return subject;
	}

	@Override
	public Subject updateSubject(Subject subject) throws BussinessException {
		return dao.updateSubject(subject);

	}

	@Override
	public void removeSubject(int subjectId) throws BussinessException {
		dao.removeSubject(subjectId);
		
	}

	@Override
	public Teacher createTeacher(Teacher teacher) throws BussinessException {
		return dao.createTeacher(teacher);
	}

	@Override
	public Teacher getTeacherById(int teacherId) throws BussinessException {
		if (teacherId <= 0) {
			throw new BussinessException("The teacherId cannot be Zero or Negative. Please supply the right teacherId.");
		}
		Teacher teacher = dao.getTeacherById(teacherId);
		if (teacher == null) {
			throw new BussinessException(
					"The teacher with teacherId '" + teacherId + "' does not exist. Please supply the right teacherId");
		}
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) throws BussinessException {
		return dao.updateTeacher(teacher);
	}

	@Override
	public void removeTeacher(int teacherId) throws BussinessException {
		dao.removeTeacher(teacherId);
		
	}

}
