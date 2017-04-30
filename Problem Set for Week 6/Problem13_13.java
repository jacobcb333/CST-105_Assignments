/*
(Enable the Course class cloneable) Rewrite the Course class in Listing 10.6
to add a clone method to perform a deep copy of the students field.
 */

/**
 *
 * @author jacobbushdiecker
 */
public class Problem13_13 {
    public static void main(String[] args){
        //Creates a Course object called course1 and adds two students
        Course course1 = new Course("Course1");
        course1.addStudent("student1");
        course1.addStudent("student2");
        
        //Create a second Course object and Clone the contents of course1
        Course course2 = (Course)course1.clone();
        
        //Checking if any of the members have the same reference
        System.out.println(course1 == course2);
        System.out.println(course1.getCourseName() == course2.getCourseName());
        System.out.println(course1.getStudents() == course2.getStudents());
    }
}
