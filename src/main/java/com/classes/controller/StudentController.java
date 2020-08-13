package com.classes.controller;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.classes.exception.BussinessException;
import com.classes.model.Student;
import com.classes.service.ClassesService;
import com.classes.service.ClassesServiceImpl;

@Path("/students")
public class StudentController {
	
	private ClassesService service = new ClassesServiceImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student student) {

		try {
			return service.createStudent(student);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@GET
	@Path("/{studentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudentById(@PathParam("studentId") int studentId) {

		try {
			return Response.ok(service.getStudentById(studentId), MediaType.APPLICATION_JSON).build();
		} catch (BussinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents() {

		try {
			return service.getAllStudents();
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}



	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateStudent(Student student) {
		try {
			return service.updateStudent(student);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}
	
	@DELETE
	@Path("/{studentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeStudent(@PathParam("studentId") int studentId) {

		try {
			service.removeStudent(studentId);
		} catch (BussinessException e) {
			System.out.println(e);
		}

	}

}
