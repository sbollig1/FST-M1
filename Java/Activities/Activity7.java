package activities;

interface BicycleParts{
	
	public int gears = 0;
	public int speed = 0;
}

interface BicycleOperations{
	
	public void applyBrake(int decrement) ;
	public void speedUp(int increment);
}

class Bicycle implements BicycleOperations, BicycleParts{
	
	public int gears;
	public int speed;
	
	Bicycle(int g, int s){
		gears = g;
		speed = s;
	
	}
	public void applyBrake(int decrement) {
		if(decrement < speed) {
			speed -= decrement;
		}
		else
			System.out.println("The Cycle is already stopped");
	}
	
	public void speedUp(int increment) {
		if(increment > speed ) {
			speed += increment;
		}
		else
			System.out.println("The spped is already has reached the limit");
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
	}
	
	
}

class MountainBike extends Bicycle{
	int seatHeight;
	public MountainBike(int g, int s, int h) {
		super(g,s);
		seatHeight = h;
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	@Override
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed+"\nHeight of the seat is: "+seatHeight);
	}
}

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 0, 25);
	    System.out.println(mb.bicycleDesc());
	    mb.speedUp(0);
	    mb.applyBrake(5);
	    System.out.println(mb.bicycleDesc());

	}

}
