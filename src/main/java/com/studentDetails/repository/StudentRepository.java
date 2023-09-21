package com.studentDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentDetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value="select name,attendance,roll_number from student where id= ?",nativeQuery = true)
	public String getResultsDetailsById(int a);
	@Query(value="select * from student where roll_number=?",nativeQuery = true)
	public Student getByRollNumber(int a);



}
