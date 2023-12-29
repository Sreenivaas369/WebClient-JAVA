package com.in.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
