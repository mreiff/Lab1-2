package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends IntroJavaCourse{
//    private String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }

//    public AdvancedJavaCourse(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    @Override
    public void courseName() {
        System.out.println("Advanced Java");
    }

    @Override
    public void courseNumber() {
        System.out.println("159-392");
    }

    @Override
    public void credits() {
        System.out.println("4");
    }
    
    @Override
    public void prerequisites() {
        System.out.println("Intro to Programming and Intro to Java");
    }
    
}
