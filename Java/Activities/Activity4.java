package activities;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {99, 65, 1, -9, 7, -9, 0};
				
		
		for(int i = 0 ;i<array.length;i++) {
			for(int j=0; j<=i; j++) {
				if(array[i] <= array[j]) {
					int temp = 0;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		for(int i =0; i<array.length; i++) {
			if(i == array.length - 1) {
				System.out.print(array[i]);
			}
			else
		System.out.print(array[i]+",");
		
		}

	}

}
