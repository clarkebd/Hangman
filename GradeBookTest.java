// Fig 3.11
// page 87
// Use this to call GradeBook.java -- for CONSTRUCTOR examples
package chapter_3_part3;

public class GradeBookTest {

    public static void main(String[] args) {

        GradeBook gradeBook1 = new GradeBook("Default value", "no one");
        GradeBook gradeBook2 = new GradeBook("Another object of Gradebook created", "Brian");

        System.out.printf("First instance created shows %s and %s\n\n", gradeBook1.getCourseName(), gradeBook1.getInstructorName());
        System.out.printf("Second instandce created shows %s and %s\n\n", gradeBook2.getCourseName(), gradeBook2.getInstructorName());

    }
}
