/*
(The Octagon class) Write a class named Octagon that extends
GeometricObject and implements the Comparable and Cloneable interfaes.
Assume that all eight sides of the octagon are of equal length. The area can
be computed using the following formula:

area = (2+4 / sqrtrt(2)) * side * side

Draw the UML Diagram that involves Octagon, GeometricObject, Comparable, and
Cloneable. Write a test program that creates an Octagon object with side
value 5 and displays its area and perimeter. Create a new object using the
clone method and compare the two objecting using the compareTo method.
 */

/**
 *
 * @author jacobbushdiecker
 */
public class Problem13_11{
    public static void main(String[] args){
        //Creates an Octagon object with 5 sides
        Octagon oc1 = new Octagon(5);
        
        //Creates a second Octagon object and clones the first one
        Octagon oc2 = (Octagon)oc1.clone();

        //Compares oc1 to oc2
        System.out.println("compareTo: " + (oc1.compareTo(oc2) == 0));
        
        //checks if oc1 equals oc2
        System.out.println("equals: " + oc1.equals(oc2));
        
        //checks if oc1 or oc2 have the same reference
        System.out.println("Have the same reference? " + (oc1 == oc2));
    }
}
