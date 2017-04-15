/*
(The Course class) Revice the Course class as follows:

1* The array size is fixed in Listing 10.6. Improve it to automatically increase
the array size by creating a new larger array and copying the contents of the 
current array to it. 
2* Implement the dropStudent method.
3* Add a new method named clear() that removes all students from the course.

Write a test program that creates a course, adds three students, removes one, 
and displays the students in the course.
 */

/**
 *
 * @author jacobbushdiecker
 */
public class Problem10_9 {
    public static void main(String[] args){
        Course course = new Course("Intro to Computer Science :");
        
        //Adds three students, Bob, Jacob, and Joseph
        course.addStudent("Bob");
        course.addStudent("Jacob");
        course.addStudent("Joseph");
        
        //Removes Bob
        course.dropStudent("Bob");
        
        //Prints the contents of the array students (Jacob and Joseph)
        for(int i = 0; i < course.getNumberOfStudents(); i++){
            System.out.println(course.getStudents()[i]);
        }
    }
}

class Course{
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;
    
    public Course(String courseName){
        this.courseName = courseName;
    }
    
    //Modifies addStudent to change the size of the students array
    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
                    
            students = temp;        
        }
        students[numberOfStudents++] = student;
    }
    
    public String[] getStudents(){
        return students;
    }
    
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    //Creates dropStudent which will remove a student if the String entered
    //Matches the String in the array
    public void dropStudent(String student){
        for(int i = 0; i < students.length; i++){
            if(student.equalsIgnoreCase(students[i])){
                students[i] = null;
                
                numberOfStudents--;
                while(i < numberOfStudents){
                    students[i] = students[i+1];
                    i++;
                }
                break;
            }
        }
    }
    
    //Will clear all names, and change numberOfStudents to 0
    public void clear(){
        students = new String[25];
        numberOfStudents = 0;
    }
    
    
}