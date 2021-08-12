package com.restApi.ResfulApiJaxRS.repo;

import java.util.HashMap;
import java.util.Map;

import com.restApi.ResfulApiJaxRS.model.Student;

public class StudentRepository {
	
	private static Map<Long, Student> students = new HashMap<Long, Student>();
	
	public static Map<Long, Student> getAllStudents(){
		return students;
	}

}
