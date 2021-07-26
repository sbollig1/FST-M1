package activities;

abstract class Book{
	public String title;
	
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book{

	public void setTitle(String s) {
	    title = s;
	}
	
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBook newNovel = new MyBook();
		newNovel.setTitle("Harry Potter and the Deadly Hollows");
		System.out.println("My new book is " +newNovel.getTitle());

	}

}
