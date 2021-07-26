package activities;



public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car Audi = new Car();
		Audi.make = 2014;
		Audi.color = "Black";
		Audi.transmission = "Manual";
		
		Audi.displayCharacteristics();
		Audi.accelarate();
		Audi.brake();

	}

}
