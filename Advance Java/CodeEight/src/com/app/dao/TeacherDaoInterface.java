package com.app.dao;

import java.util.List;

import com.app.pojos.Subject;
import com.app.pojos.Teacher;

public interface TeacherDaoInterface {
	List<Teacher> getTeachers();
	List<Subject> getSubjects(int teacherID);
	String updateSubject(Subject sub);
	String addSubject(Subject sub,Teacher t);
	String addTeacher(Teacher teach);
	Subject getSubject(int subjectId);
	Teacher getTeacher(int teacherId);
}
