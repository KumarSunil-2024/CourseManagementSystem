package com.course.model;

public class Course {
private String courseId;
private String title;
private String description;
private Instructor instrucctor;
public Course(String courseId, String title, String description, Instructor instructor) {
	super();
	this.courseId = courseId;
	this.title = title;
	this.description = description;
	this.instrucctor = instructor;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Instructor getInstrucctor() {
	return instrucctor;
}
public void setInstrucctor(Instructor instrucctor) {
	this.instrucctor = instrucctor;
}

}
