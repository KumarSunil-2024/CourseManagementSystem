package com.course.view;

import java.util.List;

import com.course.model.Course;

public class CourseView {
    
    public void displayCourseDetails(Course course) {
        System.out.println("Course ID: " + course.getCourseId());
        System.out.println("Title: " + course.getTitle());
        System.out.println("Description: " + course.getDescription());
        System.out.println("Instructor: " + course.getInstrucctor().getInstructorName());
        System.out.println("-----------------------------");
    }

    public void displayAllCourses(List<Course> courses) {
        for (Course course : courses) {
            displayCourseDetails(course);
        }
    }
}