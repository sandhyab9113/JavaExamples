package exceptions;

public class VoteEligibilityException extends Exception{

	public VoteEligibilityException(String message) {
		super("ineligible to vote");
	}


}
