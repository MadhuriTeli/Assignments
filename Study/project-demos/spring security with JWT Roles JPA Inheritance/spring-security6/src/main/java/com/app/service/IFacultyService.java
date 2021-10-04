package com.app.service;

import com.app.dto.FacultyResponseDTO;
import com.app.dto.FacultySignupRequest;

public interface IFacultyService {
	 FacultyResponseDTO registerAdmin(FacultySignupRequest adminRequest);
}
