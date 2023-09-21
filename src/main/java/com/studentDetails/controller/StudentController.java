package com.studentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentDetails.entity.Student;
import com.studentDetails.excepHandler.AgeLimitException;
import com.studentDetails.excepHandler.AttandanceNotFoundException;
import com.studentDetails.service.StudentService;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	StudentService ss;
	@PostMapping(value="/setStuDetails")
	public String setStuDetails(@RequestBody Student s) {
		return ss.setStuDetails(s);
	}
	@PostMapping(value="/setAllStuDetails")
	public String setAllStuDetails(@RequestBody List<Student> st) throws AgeLimitException {
		return ss.setAllStudetails(st);
	}
	@GetMapping(value="/getAllStuDetails")
	public List<Student> getAllStuDetails(){
		return ss.getAllStuDetails();
	}
	@DeleteMapping(value="/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		return ss.deleteById(id);
	}
	@GetMapping(value="/getById/{s}")
	public Student getById(@PathVariable int s) {
		return ss.getById(s);
	}
	@PutMapping(value="/update/{a}")
	public String update(@PathVariable int a,@RequestBody Student st) throws AgeLimitException {
		return ss.update(a,st);
	}
	@GetMapping(value="/getResultsDetailsById/{a}")
	public String getResultsDetailsById(@PathVariable int a) {
		return ss.getResultsDetailsById(a);
	}
	@GetMapping(value="/getByRollNumber/{a}")
	public Student getByRollNumber(@PathVariable int a) {
		return ss.getByRollNumber(a);
	}
	@GetMapping(value="getSecondMax")
	public String getSecondMax() throws AttandanceNotFoundException{
		return ss.getSecondMax();
	}

}
