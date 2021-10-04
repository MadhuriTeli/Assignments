package com.app.service;

import com.app.dto.StudentResponseDTO;
import com.app.dto.StudentSignupRequest;

public interface IStudentService {
	 StudentResponseDTO registerStudent(StudentSignupRequest studentRequest);
}
