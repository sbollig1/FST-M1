package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10, 77, 10, 54, -11, 10};
		int sum = 0;
		
		for(int i = 0; i<6; i++) {
		if(array[i]==10) {
			sum+=array[i];
		}
		}
		System.out.println("The sum of teh 10's are "+ sum);

	}

}
