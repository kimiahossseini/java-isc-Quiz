package service;

public class UserNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3815284646064499723L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
