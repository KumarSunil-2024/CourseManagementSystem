package com.course.controller;

import java.util.List;

import com.course.model.Course;
import com.course.model.CourseDatabase;
import com.course.view.CourseView;

public class CourseController {
private CourseDatabase courseDatabase;
private CourseView courseView;
public CourseController(CourseDatabase courseDatabase, CourseView courseView) {
	this.courseDatabase = courseDatabase;
	this.courseView = courseView;
}
public void addCourse(Course course) {
	courseDatabase.addCourse(course);
}
public void removeCourse(String courseId) {
	courseDatabase.removeCourse(courseId);
}
public void displayAllCourses() {
	List<Course> courses=courseDatabase.getAllCourses();
	courseView.displayAllCourses(courses);
}
}
