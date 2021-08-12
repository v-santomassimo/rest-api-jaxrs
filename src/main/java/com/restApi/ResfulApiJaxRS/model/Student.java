package com.restApi.ResfulApiJaxRS.model;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.restApi.ResfulApiJaxRS.utils.Utility;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	private Long id;
	private String name;
	private String lastname;
	private Integer age;
	private String studentId; //matricola
	private String message;
	
	
	public Student() {
		
	}
	
	
	public Student(String message) {
		this.message=message;
	}
	
	public Student(Long id, String name, String lastname, Integer age) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		setStudentId(name, lastname);
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String name, String lastname) {		
		this.studentId = Utility.generateStudentId(Utility.getConsonant(name), Utility.getConsonant(lastname));
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", age=" + age + ", studentId=" + studentId + "]";
	}
	
	

}
