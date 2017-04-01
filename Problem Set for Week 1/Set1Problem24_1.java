import java.util.*;

public class Set1Problem24_1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Creates an ArrayList called list1
		List<String> list1 = new ArrayList<>();
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		//creates an ArrayList called list2
		List<String> list2 = new ArrayList<>();
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		//Adds all strings in list2 to list 1 then outputs each list
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println(list2);
		//Removes all list2 strings from list 1 (including strings that were in list1 before
		//having list2 added)
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println(list2);
		//Reset list1 that puts back Tom and George who were removed with the removeAll
		list1.add("Tom");
		list1.add("George");
		//Retains string in list1 that are present in list1 and list 2
		list1.retainAll(list2);
		System.out.println(list1);
		System.out.println(list2);
	}
}
