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
import com.classes.model.Teacher;
import com.classes.service.ClassesService;
import com.classes.service.ClassesServiceImpl;

@Path("/teachers")
public class TeacherController {

	private ClassesService service = new ClassesServiceImpl();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Teacher createTeacher(Teacher teacher) {

		try {
			return service.createTeacher(teacher);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@GET
	@Path("/{teacherId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTeacherById(@PathParam("teacherId") int teacherId) {
		try {
			return Response.ok(service.getTeacherById(teacherId), MediaType.APPLICATION_JSON).build();
		} catch (BussinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> getAllTeachers() {

		try {
			return service.getAllTeachers();
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@PATCH
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Teacher updateTeacher(Teacher teacher) {

		try {
			return service.updateTeacher(teacher);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@DELETE
	@Path("/{teacherId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeTeacher(@PathParam("teacherId") int teacherId) {

		try {
			service.removeTeacher(teacherId);
		} catch (BussinessException e) {
			System.out.println(e);
		}

	}
}
