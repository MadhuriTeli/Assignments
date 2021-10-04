
package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.dao.RoleRepository;
import com.app.dao.StudentRepository;
import com.app.dto.StudentResponseDTO;
import com.app.dto.StudentSignupRequest;
import com.app.pojos.Student;
import com.app.pojos.UserRoles;

public class StudentServiceImpl implements IStudentService {
	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public StudentResponseDTO registerStudent(StudentSignupRequest studentRequest) {
		Student student = new Student();
		BeanUtils.copyProperties(studentRequest, student);
		student.setPassword(encoder.encode(studentRequest.getPassword()));// set encoded pwd
//commenting below code : since here it's student login has a fixed role : ROLE_STUDENT
//		Set<Role> roles = studentRequest.getRoles().stream()// convert Set<String> : role names ---> Stream<String>
//				// mapping roleName --> Role (using RoleRepo)
//				.map(roleName -> roleRepo.findByUserRole(UserRoles.valueOf(roleName)).get())
//				// collect in a Set<Role>
//				.collect(Collectors.toSet());
//		student.setRoles(roles);
		student.getRoles().add(roleRepo.findByUserRole(UserRoles.ROLE_STUDENT).get());
		student.setActive(true);
		System.out.println("student " + student);
		StudentResponseDTO studentDTO = new StudentResponseDTO();
		BeanUtils.copyProperties(studentRepo.save(student), studentDTO);
		System.out.println("student resp dto " + studentDTO);

		return studentDTO;

	}

}
