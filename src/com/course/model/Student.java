package com.course.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	private List<Course> enrolledCourse;
	public Student(int id, String name, String email) {
		super(id, name, email);
		enrolledCourse=new ArrayList<>();
	}
	public void enrollCourse(Course course) {
		enrolledCourse.add(course);
	}
	public List<Course> getEnrolledCourse(){
		return enrolledCourse;
		
	}

}
