package com.classes.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.classes.dao.ClassesDAO;
import com.classes.exception.BussinessException;
import com.classes.model.Student;
import com.classes.model.Subject;
import com.classes.model.Teacher;

public class ClassesDAOImpl implements ClassesDAO {

	private Configuration configuration = new Configuration().configure();
	private StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	private SessionFactory factory=configuration.buildSessionFactory(builder.build());
	
	@Override
	public Class createClass(Class classes) throws BussinessException {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(classes);
		transaction.commit();
		session.close();
		return classes;
	}

	@Override
	public Class getClassById(int classId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Class classes = (Class) session.get(Class.class, classId);
		transaction.commit();
		session.close();
		return classes;
	}

	@Override
	public Class updateClass(Class classes) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(classes);
		transaction.commit();
		session.close();
		return classes;
	}

	@Override
	public void deleteClass(int classId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		com.classes.model.Class classes = new com.classes.model.Class();
		classes.setClassId(classId);
		session.delete(classes);
		
		transaction.commit();
		session.close();
		
	}

	@Override
	public List<Class> getAllClasses() throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Class> classesList = session.createQuery("from com.classes.model.Class").list();
		transaction.commit();
		session.close();
		return classesList;
	}

	@Override
	public List<Subject> getAllSubjects() throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Subject> subjectList = session.createQuery("from com.classes.model.Subject").list();
		transaction.commit();
		session.close();
		return subjectList;
	}

	@Override
	public List<Teacher> getAllTeachers() throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Teacher> teacherList = session.createQuery("from com.classes.model.Teacher").list();
		transaction.commit();
		session.close();
		return teacherList;
	}

	@Override
	public List<Student> getAllStudents() throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Student> studentList = session.createQuery("from com.classes.model.Student").list();
		transaction.commit();
		session.close();
		return studentList;
	}

	@Override
	public Student createStudent(Student student) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public Student getStudentById(int studentId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student student = (Student) session.get(Student.class, studentId);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public Student updateStudent(Student student) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(student);
		transaction.commit();
		session.close();
		return student;
	}

	@Override
	public void removeStudent(int studentId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Student stu = new Student();
		stu.setStudentId(studentId);
		session.delete(stu);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Subject createSubject(Subject subject) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public Subject getSubjectById(int subjectId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject subject = (Subject) session.get(Subject.class, subjectId);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public Subject updateSubject(Subject subject) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(subject);
		transaction.commit();
		session.close();
		return subject;
	}

	@Override
	public void removeSubject(int subjectId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Subject sub = new Subject();
		sub.setSubjectId(subjectId);
		session.delete(sub);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Teacher createTeacher(Teacher teacher) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public Teacher getTeacherById(int teacherId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Teacher teacher = (Teacher) session.get(Teacher.class, teacherId);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(teacher);
		transaction.commit();
		session.close();
		return teacher;
	}

	@Override
	public void removeTeacher(int teacherId) throws BussinessException {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Teacher tea = new Teacher();
		tea.setTeacherId(teacherId);
		session.delete(tea);
		transaction.commit();
		session.close();
		
	}

	
}
