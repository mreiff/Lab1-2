/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab2;

/**
 *
 * @author mreiff
 */
public class Lab2Run {
    public static void main(String[] args) {
        Lab2Superclass introToProg = new IntroToProgrammingCourse();
        SecondLabSuperclass2 introToJava = new IntroJavaCourse();
        SecondLabSuperclass2 advancedJava = new AdvancedJavaCourse();
        
        System.out.println("Intro To Programming");
        System.out.println("Prerequisites = None");
        introToProg.credits(); System.out.println(" credits");
        introToProg.courseNumber(); System.out.println(" is the course number.");
        introToProg.courseName(); System.out.println(" is the course name.");
        
        System.out.println("Intro To Java");
        introToJava.prerequisites(); System.out.println(" are the prerequisites");
        introToJava.credits(); System.out.println(" credits");
        introToJava.courseNumber(); System.out.println(" is the course number.");
        introToJava.courseName(); System.out.println(" is the course name.");
        
        System.out.println("Advanced Java");
        advancedJava.prerequisites(); System.out.println(" are the prerequisites");
        advancedJava.credits(); System.out.println(" credits");
        advancedJava.courseNumber(); System.out.println(" is the course number.");
        advancedJava.courseName(); System.out.println(" is the course name.");
    }
}
