package service;

import java.util.List;


import model.Loan;

public class LoanServiceApp {

	public static void main(String[] args) {
		try {
			List<Loan> loans=LoanService.findUserLoans("Bad Pay");
			System.out.println(loans);
		} catch (UserNotFoundException e) {
			System.out.println("Coud not find user, check and try again");
			
		}
		System.out.println( "--------------------------------");
		try {
			var loans = LoanService.findUserLoans("Rich Guy");
			System.out.println( loans );
		} catch (UserNotFoundException e) {
			System.out.println("Coud not find user, check and try again");
		}
    	System.out.println( "--------------------------------");
    	try {
			var hasLoans = LoanService.isUserLoansDateReached("Bad Pay");
			System.out.println( "User has due dated loans: " + hasLoans);
		} catch (UserNotFoundException e) {
			System.out.println("Coud not find user, check and try again");
		} catch (NoLoanForUserException e) {
			System.out.println("The user has no loans at all");
		}
    	System.out.println( "--------------------------------");
    	try {
			var hasLoans = LoanService.isUserLoansDateReached("Bad Pay");
			System.out.println( "(Multi Catch)User has due dated loans: " + hasLoans);
		} catch (UserNotFoundException | NoLoanForUserException e) {
			System.out.println("Coud not find user, or he has no loans");
		}
		
		

	}

}
