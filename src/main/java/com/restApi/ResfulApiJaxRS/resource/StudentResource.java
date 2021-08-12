package com.restApi.ResfulApiJaxRS.resource;

import java.util.List;

import com.restApi.ResfulApiJaxRS.model.Student;
import com.restApi.ResfulApiJaxRS.service.StudentService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class StudentResource {
	
	StudentService studentService = new StudentService();
	
	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_JSON) 
	public Response getStudents() {
		List<Student> students= studentService.getAllStudent();
		
		//preserva il tipo specifico dell'oggetto (Student);
		GenericEntity<List<Student>> entity = new GenericEntity<List<Student>>(students) {};
		
		return Response.ok(entity).build();
		
	}
	
	@GET
	@Path("/get-student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentbyId(@PathParam("id") Long id) {
		
		return studentService.getStudentById(id);
	
	}
	
	@POST
	@Path("/new-student")
	@Consumes(MediaType.APPLICATION_JSON)  //specifica il formato del request body che riceve;
	@Produces(MediaType.APPLICATION_JSON)
	public String addStudent(Student newStudent) {
		return studentService.addStudent(newStudent);
	}
	
	
	@PUT
	@Path("/update-student/{id}")
	@Consumes(MediaType.APPLICATION_JSON)  //specifica il formato del request body che riceve;
	@Produces(MediaType.APPLICATION_JSON)
	public Student update(@PathParam("id") Long id, Student s) {
		s.setId(id);
		return studentService.updateStudent(s);
	}

	/*
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudents() {
		return "I'm a student!";
	}
	*/
	
}
