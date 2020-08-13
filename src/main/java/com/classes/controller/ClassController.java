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
import com.classes.service.ClassesService;
import com.classes.service.ClassesServiceImpl;

@Path("/classes")
public class ClassController {

	private ClassesService service = new ClassesServiceImpl();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Class createClass(Class classes) {

		try {
			return service.createClass(classes);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@GET
	@Path("/{classId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getClassById(@PathParam("classId") int classId) {

		try {
			return Response.ok(service.getClassById(classId), MediaType.APPLICATION_JSON).build();
		} catch (BussinessException e) {
			return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Class> getAllClasses() {

		try {
			return service.getAllClasses();
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}
	@PATCH
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Class updateClass(Class classes) {

		try {
			return service.updateClass(classes);
		} catch (BussinessException e) {
			System.out.println(e);
		}
		return null;
	}

	@DELETE
	@Path("/{classId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteClass(@PathParam("classId") int classId) {

		try {
			service.deleteClass(classId);
		} catch (BussinessException e) {
			System.out.println(e);
		}

	}
	
	
	
	
	
	

}


