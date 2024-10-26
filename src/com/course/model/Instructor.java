package com.course.model;

public class Instructor {
private String courseId;
private String instructorName;
private String instructorEmail;
public Instructor(String courseId, String instructorName, String instructorEmail) {
	this.courseId = courseId;
	this.instructorName = instructorName;
	this.instructorEmail = instructorEmail;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getInstructorName() {
	return instructorName;
}
public void setInstructorName(String instructorName) {
	this.instructorName = instructorName;
}
public String getInstructorEmail() {
	return instructorEmail;
}
public void setInstructorEmail(String instructorEmail) {
	this.instructorEmail = instructorEmail;
}
}
