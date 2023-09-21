package com.studentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentDetails.entity.Student;
import com.studentDetails.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sr;
	public String setStuDetails(Student s) {
		sr.save(s);
		return "Saved";
	}
	public String setAllStuDetails(List<Student> ts) {
	  sr.saveAll(ts);
		return "Saved all";
	}
	public List<Student> getAllStuDetails() {
		
		return sr.findAll();
	}
	public String deleteById(int id) {
		sr.deleteById(id);
		return "Deleted";
	}
	public Student getById(int s) {
		
		return sr.findById(s).get();
	}
	public String getResultsDetailsById(int a) {
		
		return sr.getResultsDetailsById(a);
	}
	public Student getByRollNumber(int a) {
		
		return sr.getByRollNumber(a);
	}
	
	}


