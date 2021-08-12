package com.restApi.ResfulApiJaxRS.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.restApi.ResfulApiJaxRS.model.Student;
import com.restApi.ResfulApiJaxRS.repo.StudentRepository;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.GenericEntity;
import jakarta.ws.rs.core.MediaType;


public class StudentService {
	
	private Map<Long, Student> studentRepo = StudentRepository.getAllStudents();
	
	
	
	public StudentService() {
		studentRepo.put(1L,new Student(1L, "Veronica", "Rossi", 18));
		studentRepo.put(2L, new Student(2L, "Alessio", "Longobardi", 20));
		studentRepo.put(3L, new Student(3L, "Biagio", "Bianchi", 22));
	}
	
	

	public List<Student> getAllStudent(){
//		List<Student> allStudent = Arrays.asList(new Student(1L, "Veronica", "Rossi", 18), 
//												 new Student(2L, "Alessio", "Longobardi", 20),
//												 new Student(3L, "Biagio", "Bianchi", 22));

		return new ArrayList<Student>(studentRepo.values());
		
	}
	
	public Student getStudentById(Long id) {
		if(studentRepo.containsKey(id)) {
			return studentRepo.get(id);
		}
		return new Student("Student id: "+id+" doesn't exist");
	}
	
	public String addStudent(Student newStudent) {
		if(studentRepo.containsKey(newStudent.getId())) {
			return "Student id: "+ newStudent.getId() + " already present";
		}
		//newStudent.setStudentId(newStudent.getName(), newStudent.getLastname());
		Student freshStudent = new Student();
		freshStudent.setId(newStudent.getId());
		freshStudent.setName(newStudent.getName());
		freshStudent.setLastname(newStudent.getLastname());
		freshStudent.setAge(newStudent.getAge());
		freshStudent.setStudentId(freshStudent.getName(), freshStudent.getLastname());
		studentRepo.put(freshStudent.getId(), freshStudent);
		return "Student added correctly!";
	}
	
	public String removeStudent(Long id) {
		if(studentRepo.containsKey(id)) {
			studentRepo.remove(id);
			return "Student id: "+ id + " removed correctly!";
		}else {
			return "Student id: "+ id + " doesn't exist!";
		}
	}
	
	public Student updateStudent(Student student) {
		if(student.getId() <= 0) {
			return new Student("Student id: "+student.getId()+" doesn't exist"); //??
		} else {
			//recupero l'oggetto con chiave id uguale a quella dell'oggetto modificato;
			Student s = studentRepo.get(student.getId());
			s.setAge(student.getAge());
			s.setName(student.getName());
			s.setLastname(student.getLastname());
			studentRepo.remove(student.getId());
			studentRepo.put(s.getId(), s);
			
			return s;
		}
		
	}
	

}
 