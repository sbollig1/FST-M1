package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Kim");
		hs.add("Jun");
		hs.add("Lion");
		hs.add("Mall");
		hs.add("Neon");
		hs.add("Ox");
		System.out.println(hs);
		if(hs.remove("Ant")) {
        	System.out.println("Ant removed from the Set");
        } else {
        	System.out.println("Ant is not present in the Set");
        }
		hs.remove("Neon");
		
		System.out.println("Is Ball in set? "+hs.contains("Ball"));
		System.out.println(hs);

	}

}
