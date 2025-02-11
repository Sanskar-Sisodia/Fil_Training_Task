package com.spr3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class TestAll {
    public static void main(String[] args) {
        // Load application context
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Access CourseDAO
        CourseDAO courseDAO = (CourseDAO) ac.getBean("courseDAO");

        // Save a new Course
        Course course = new Course(106, "Data Science", 4);
        courseDAO.savePS(course);
        System.out.println("Course Added: " + course);

        // Retrieve all Courses
        List<Course> courseList = courseDAO.getAllCourses();
        System.out.println("\nAll Courses:");
        for (Course c : courseList) {
            System.out.println(c);
        }

        // Access BranchDAO
        BranchDAO branchDAO = (BranchDAO) ac.getBean("branchDAO");

        // Save a new Branch
        Branch branch = new Branch(4, "Cyber Security");
        branchDAO.savePS(branch);
        System.out.println("\nBranch Added: " + branch);

        // Retrieve all Branches
        List<Branch> branchList = branchDAO.getAllBranches();
        System.out.println("\nAll Branches:");
        for (Branch b : branchList) {
            System.out.println(b);
        }
    }
}
