package com.in.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.in.Entity.Student;
import com.in.Repository.StudentRepository;
import com.in.Response.College;
import com.in.Response.Response;
import com.in.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sRepo;

	@Autowired
	private WebClient.Builder webclient;

	@Override
	public Student saveStudentService(Student student) {
		return sRepo.save(student);
	}

	@Override
	public Student getStudentService(int studentId, Student student) {
		return sRepo.findById(studentId).get();
	}

	@Override
	public Response getStudentWebclientService(int studentId, Student student) {
		Response response = new Response();
		Student s = sRepo.findById(studentId).get();
		response.setStudent(s);
		int collegeId = s.getCollegeId();
		College clg = webclient.build().get().uri("http://localhost:2000/get/College/" + collegeId).retrieve()
				.bodyToMono(College.class).block();
		response.setCollege(clg);
		return response;
	}

}
