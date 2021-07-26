package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Srilekha");
		myList.add("Vani");
		myList.add("Nani");
		myList.add("Bunny");
		myList.add("Jimmy");
		// myList.add(3, "Grapes");
		
		System.out.println("The Thirs name in list is"+myList.get(2));
		
		System.out.println(myList);
		
		String name ="Srilekha";
		
		boolean val = myList.contains(name);
		if(val)
			System.out.println("Name present");
		else
			System.out.println("Name not present");
		
		System.out.println("Size of list is "+myList.size());
		
		myList.remove(2);
		System.out.println("Size of the list after removal of name is "+myList.size());
		

	}

}
