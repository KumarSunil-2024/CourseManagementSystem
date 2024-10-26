package com.course;

import java.util.Scanner;

import com.course.controller.CourseController;
import com.course.model.Course;
import com.course.model.CourseDatabase;
import com.course.model.Instructor;
import com.course.view.CourseView;

public class CourseManagementSystem {
 public static void main(String[] args) {
     CourseDatabase courseDatabase = new CourseDatabase(); // Instantiate model
     CourseView courseView = new CourseView(); // Instantiate view
     CourseController courseController = new CourseController(courseDatabase, courseView); // Instantiate controller

     Scanner scanner = new Scanner(System.in); // Scanner for user input
     while (true) {
         
         System.out.println("1. Add Course");
         System.out.println("2. Remove Course");
         System.out.println("3. View All Courses");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");

         int choice = scanner.nextInt(); 
         scanner.nextLine();  
         switch (choice) {
             case 1:
                 System.out.print("Enter Course ID: ");
                 String courseId = scanner.nextLine();
                 System.out.print("Enter Title: ");
                 String title = scanner.nextLine();
                 System.out.print("Enter Description: ");
                 String description = scanner.nextLine();
                 System.out.print("Enter Instructor Name: ");
                 String instructorName = scanner.nextLine();
                 Instructor instructor = new Instructor("I001", instructorName, "instructor@example.com");
                 Course course = new Course(courseId, title, description, instructor);
                 courseController.addCourse(course);
                 break;
             case 2: 
                 System.out.print("Enter Course ID to remove: ");
                 String removeCourseId = scanner.nextLine();
                 courseController.removeCourse(removeCourseId);
                 break;
             case 3: 
                 courseController.displayAllCourses(); 
                 break;
             case 4: 
                 System.out.println("Exiting...");
                 return;
             default:
                 System.out.println("Invalid option, please try again."); 
         }
     }
 }
}

