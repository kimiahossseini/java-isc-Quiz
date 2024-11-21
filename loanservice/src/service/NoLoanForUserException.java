package service;

public class NoLoanForUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6719194985233837754L;

	public NoLoanForUserException(String message) {
		super(message);
	}

}
