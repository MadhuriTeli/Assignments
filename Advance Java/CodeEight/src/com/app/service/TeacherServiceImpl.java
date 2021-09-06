package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TeacherDaoInterface;
import com.app.pojos.Subject;
import com.app.pojos.Teacher;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherServiceInterface{
	@Autowired
	private TeacherDaoInterface dao;
	
	public TeacherServiceImpl() {
		System.out.println("In teacher service constr::");
	}
	
	@Override
	public List<Teacher> getTeachers() {
		return dao.getTeachers();
	}

	@Override
	public List<Subject> getSubjects(int teacherID) {
		return dao.getSubjects(teacherID);
	}

	@Override
	public String updateSubject(Subject sub) {
		return dao.updateSubject(sub);
	}

	@Override
	public String addSubject(Subject sub,Teacher t) {
		return dao.addSubject(sub,t);
	}

	@Override
	public String addTeacher(Teacher teach) {
		return dao.addTeacher(teach);
	}

	@Override
	public Subject getSubject(int subjectId) {
		return dao.getSubject(subjectId);
	}
	
	@Override
	public Teacher getTeacher(int teacherId) {
		return dao.getTeacher(teacherId);
	}


}
