package com.spr2;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCourseBranch {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        CourseBranch courseBranch = (CourseBranch) ac.getBean("courseBranchObj");
        CourseBranchDAO courseBranchDAO = (CourseBranchDAO) ac.getBean("courseBranchDAO");

        courseBranchDAO.savePS(courseBranch);
        System.out.println("Course and Branch Added: " + courseBranch);
    }
}
