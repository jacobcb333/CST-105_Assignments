package Problem14;

/*
(The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList to
replace an array to store students. Draw the UML diagram for the class. You should
not change the original contact of the Course class (i.e., the definition of the
constructors ad methods should not be changed, but the private members may be
changed.)
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Problem11_05 {
}

class Course{
    private String courseName;
    //Creates the arraylist
    private ArrayList<String> students = new ArrayList<>();

    //creates an object of the class
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    //adds a student
    public void addStudent(String student){

        students.add(student);
    }
    
    //acesses the private arraylist students
    public String[] getStudents(){
        return students.toArray(new String[students.size()]);
    }
    
    //returns the amount of students in the course
    public int getNumberOfStudents(){
        return students.size();
    }
    
    //returns the course name
    public String getCourseName(){
        return courseName;
    }
    
    //removes and student from the array list
    public void dropStudent(String student){
        students.remove(student);
    }
    
    //Clears the arraylist students
    public void clear(){
        students.clear();
    }

}
