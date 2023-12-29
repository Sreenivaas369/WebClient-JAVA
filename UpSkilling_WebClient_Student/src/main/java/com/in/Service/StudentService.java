package com.in.Service;

import com.in.Entity.Student;
import com.in.Response.Response;

public interface StudentService {

	Student saveStudentService(Student student);

	Student getStudentService(int studentId, Student student);

	Response getStudentWebclientService(int studentId, Student student);
	

}
