package exceptions;

public class TestThrow1 {
	public static void validate(int age) throws VoteEligibilityException {  
		if(age<18) {  
			//throw Arithmetic exception if not eligible to vote  
			throw new VoteEligibilityException(null);
			//ArithmeticException("Person is not eligible to vote");    
		}  
		else {  
			System.out.println("Person is eligible to vote!!");  
		}  
	}  
	//main method  
	public static void main(String args[]){  
		//calling the function  
		try {
			validate(15);
		} catch (VoteEligibilityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("rest of the code...");    
	}    


}
