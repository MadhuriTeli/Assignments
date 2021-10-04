package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.FacultyRepository;
import com.app.pojos.Faculty;

@Service
@Transactional
public class FacultyImpl implements IFacultyService {
	@Autowired
	private FacultyRepository facultyRepo;

	@Override
	public Faculty registerFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyRepo.save(faculty);
	}

}
