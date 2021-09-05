package com.app.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IStudentDao;
import com.app.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	//dependency
	@Autowired
	private IStudentDao studentDao;
	

	@Override
	public String admitStudent(int courseId, Student s) {
		// validate 
		if(s.getDob().isBefore(LocalDate.of(1990, 1,1)) || s.getCgpa() <7)
		{
			//=> validation error
			return "Student Admission Failed : Invalid Inputs..";
		}
		//=> valida details
		return studentDao.admitStudent(courseId, s);
	}

}
