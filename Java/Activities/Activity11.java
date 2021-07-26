package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<int, String> colours = new Map<int, String>();
		Map<Integer, String> colours = new HashMap<>();
		colours.put(1,"Blue");
		colours.put(2, "Red");
		colours.put(3, "Green");
		colours.put(4, "Black");
		colours.put(5, "Pink");
		
		System.out.println(colours);
		
		System.out.println("Removing the Black from Map ");
		colours.remove(4);
		System.out.println(" After removing black: "+colours);
		
		if(colours.containsValue("Green"))
			System.out.println("Green is present");
		else
			System.out.println("Green not present");
		
		System.out.println("The size of map "+ colours.size());

	}

}
