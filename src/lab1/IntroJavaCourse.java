package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.prerequisites = prerequisites;
    }

//    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
//    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    public void courseName() {
        System.out.println("Intro to Java");
    }

    @Override
    public void courseNumber() {
        System.out.println("109-342");
    }

    @Override
    public void credits() {
        System.out.println("3");
    }
    
    @Override
    public void prerequisites() {
        System.out.println("Intro to Programming");
    }

}
