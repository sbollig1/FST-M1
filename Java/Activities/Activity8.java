package activities;

class CustomException extends Exception{
	
	private String message;
	
	CustomException(String message){
		this.message = message;
	}
	
	@Override
	public String getMessage() {
	    return message;
	}
	
}

public class Activity8 {
	
	void exceptionTest(String message) throws CustomException{
		
		if(message == null)
			throw new CustomException("Null cannot be accepted");
		else
			System.out.println(message);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Activity8 CustomExceptionActivity = new Activity8();
		
		try {
			CustomExceptionActivity.exceptionTest("Will print to console");
			CustomExceptionActivity.exceptionTest(null);
			
		}
		
		catch(CustomException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
