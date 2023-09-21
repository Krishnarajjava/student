package com.studentDetails.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentDetails.dao.StudentDao;
import com.studentDetails.entity.Student;
import com.studentDetails.excepHandler.AgeLimitException;
import com.studentDetails.excepHandler.AttandanceNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	public String setStuDetails(Student s) {
		
		return sd.setStuDetails(s);
	}
	public String setAllStudetails(List<Student> st) throws AgeLimitException {
	
	List<Student> ts= st.stream().filter(x->x.getAge()>18).toList();
	if(ts.isEmpty()) {
		throw new AgeLimitException("Invalid Data");
	}
	else {
		return sd.setAllStuDetails(ts);
	}
	}
	public List<Student> getAllStuDetails() {
		
		return sd.getAllStuDetails();
	}
	public String deleteById(int id) {
		
		return sd.deleteById(id) ;
	}
	public Student getById(int s) {
		
		return sd.getById(s);
	}
	public String update(int a, Student st) throws AgeLimitException {
		Student x= getById(a);
		Student y=st;
		x.setId(a);
		x.setName(y.getName());
		x.setAge(y.getAge());
		
		 sd.setStuDetails(x);
		return "Updated";
	}
	public String getResultsDetailsById(int a) {
		
		return sd.getResultsDetailsById(a);
	}
	public Student getByRollNumber(int a) {
		
		return sd.getByRollNumber(a);
	}
	public String getSecondMax() throws AttandanceNotFoundException{
	
		List<Student> a=getAllStuDetails();
		Integer in=a.stream().sorted(Comparator.comparing(Student::getAttendance).reversed()).
				skip(1).findFirst().map(x->x.getAttendance()).get();
		try {
		if(in<90) {
			return "This is less 90";
		}
		else {
			throw new AttandanceNotFoundException("Second Max is more than 90");
		}
		}
		catch(AttandanceNotFoundException m) {
			return m.getMessage();
		}
		
	
		
	}



}
