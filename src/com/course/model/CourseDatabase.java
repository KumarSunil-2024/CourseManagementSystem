package com.course.model;

import java.util.ArrayList;
import java.util.List;

public class CourseDatabase {
private List<Course> courses=new ArrayList<>();

public void addCourse(Course course) {
	courses.add(course);
}
public void removeCourse(String courseId) {
  courses.removeIf(course -> course.getCourseId().equals(courseId));
}
public List<Course> getAllCourses() {
	return courses;
}
}
