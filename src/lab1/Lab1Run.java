/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author mreiff
 */
public class Lab1Run {
    public static void main(String[] args) {
        IntroToProgrammingCourse introToProg = new IntroToProgrammingCourse("Intro to Programming", "143-301",2);
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java","109-342",3,"Intro to Programming");
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java","159-392",4,"Intro to Programming and Intro to Java");
        
        System.out.println("intro to programming");
        introToProg.courseName();
        introToProg.courseNumber();
        introToProg.credits();
        introToProg.prerequisites();
        System.out.println("intro to java");
        introJava.courseName();
        introJava.courseNumber();
        introJava.credits();
        introJava.prerequisites();
        System.out.println("Advanced java");
        advJava.courseName();
        advJava.courseNumber();
        advJava.credits();
        advJava.prerequisites();
    }
}
