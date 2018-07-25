//Gradebook with a CONSTRUCTOR example
// FIG 3.10 page 85
package chapter_3_part3;

public class GradeBook {

    private String courseName;
    private String instructor;

    // CONSTRUCTOR here
    public GradeBook(String name, String instructorName) {
        courseName = name;  // Initialize coursename to whatever was passed when the object was created
        instructor = instructorName; // initialize instructors name too
    }

    // METHOD -  set coursename as CONSTRUCTOR is only used on initial object creation
    public void setCourseName(String name) {
        courseName = name;
    }
    // METHOD -  set an Instructor Name

    public void setInstructorName(String instructorName) {
        instructor = instructorName;
    }

    public String getCourseName() {
        return (courseName);
    }

    public String getInstructorName() {
        return (instructor);
    }

    public void displayMessage() {
        System.out.printf("Course name = %s \n\n", getCourseName());
        System.out.printf("Instructor is %s \n\n", getInstructorName());
    }

}
