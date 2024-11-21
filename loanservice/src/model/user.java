package model;

import java.util.List;

public class user {
	private String username;
	List<Loan> loans;
	public user(String username, List<Loan> loans) {
		super();
		this.username = username;
		this.loans = loans;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	@Override
	public String toString() {
		return "user [username=" + username + ", loans=" + loans + "]";
	}
	


}
