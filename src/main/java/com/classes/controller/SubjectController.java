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
import com.classes.model.Subject;
import com.classes.service.ClassesService;
import com.classes.service.ClassesServiceImpl;

@Path("/subjects")
public class SubjectController {

	private ClassesService service = new ClassesServiceImpl();
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Subject createSubject(Subject subject) {
		try {
			return service.createSubject(subject);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return subject;

	}

	@GET
	@Path("/{subjectId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSubjectById(@PathParam("subjectId") int subjectId) {

		try {
			return Response.ok(service.getSubjectById(subjectId), MediaType.APPLICATION_JSON).build();
		} catch (BussinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Subject> getAllSubject() {

		try {
			return service.getAllSubjects();
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@PATCH
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Subject updateSubject(Subject subject) {

		try {
			return service.updateSubject(subject);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@DELETE
	@Path("/{subjectId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void removeSubject(@PathParam("subjectId") int subjectId) {

		try {
			service.removeSubject(subjectId);
		} catch (BussinessException e) {
			System.out.println(e);
		}

	}
}
