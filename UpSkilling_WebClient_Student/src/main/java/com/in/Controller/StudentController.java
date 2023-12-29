package com.in.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.in.Entity.Student;
import com.in.Response.College;
import com.in.Response.Response;
import com.in.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService sService;

	

	@PostMapping("/save/Student")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<>(sService.saveStudentService(student), HttpStatus.CREATED);
	}

	@GetMapping("/get/student/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable int studentId, Student student) {
		return new ResponseEntity<>(sService.getStudentService(studentId, student), HttpStatus.OK);
	}

	@GetMapping("/get/Response/{studentId}")
	public ResponseEntity<Response> getStudentWebclient(@PathVariable int studentId, Student student) {
		return new ResponseEntity<>(sService.getStudentWebclientService(studentId, student), HttpStatus.OK);

	}

}
