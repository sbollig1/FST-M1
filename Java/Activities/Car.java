package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
		
	public Car() {
		tyres = 4;
		doors = 4;
	}
		
	void displayCharacteristics() {
		System.out.println("The Color of the Car is "+ color);
		System.out.println("The Transmission of the car is " + transmission);
		System.out.println("The Care is manufactured in "+ make);
		System.out.println("The number of Tyres and doors are " + tyres+" "+ doors+ " respectively");
	}
	
	void accelarate() {
		System.out.println("Car is moving forward.");
	}
	
	void brake() {
		System.out.println("Car has stopped.");
	}
	

}
