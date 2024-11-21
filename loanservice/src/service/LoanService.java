package service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import model.Loan;
import model.LoanType;
import model.user;

public class LoanService {
	private static final Logger logger = Logger.getLogger(LoanService.class.getName());
	private static List<user> users;
	static{
	Loan loan1=new Loan("Car Loan", LocalDateTime.of(2027, 5, 1, 0, 0), 15000, LoanType.CAR);
	Loan loan2 = new Loan("Home Loan", LocalDateTime.of(2028, 10, 15, 0, 0), 250000, LoanType.HOUSE);
    Loan loan3 = new Loan("Wedding Loan", LocalDateTime.of(2022, 12, 20, 0, 0), 20000, LoanType.MARIAGE);
    Loan loan4 = new Loan("Repair Loan", LocalDateTime.of(2023, 8, 30, 0, 0), 5000, LoanType.REPAIR);
    
    // Create sample users with loans
    user user1 = new user("Good Pay", List.of(loan1, loan2));
    user user2 = new user("Bad Pay", List.of(loan3, loan4));
    user user3 = new user("Rich Guy", new ArrayList<>()); // No loans
    users= List.of(user1,user2,user3);
    
	}
	//--------------------------------------------------------------------- 
    public static List<Loan> findUserLoans(String username) throws UserNotFoundException{
		logger.info("searching for: "+username);
    	user finduser=users.stream()
				.filter(t -> t.getUsername().equals(username)).findFirst().get();
		if (finduser == null) {
		logger.warning(username+" is not found");
			throw new UserNotFoundException("we couldn't find user");
		}
    	
    	return finduser.getLoans();
    	
    }
    ////--------------------------------------------------------------------
    public static boolean isUserLoansDateReached(String username)throws UserNotFoundException,NoLoanForUserException{
    	logger.info("searching for "+username);
    	user user = users
				.stream()
				.filter(t -> t.getUsername().equals(username))
				.findFirst()
				.orElseThrow(() -> new UserNotFoundException("we couldn't find user") );
		
		if( user.getLoans().size() == 0 ) {
			throw new NoLoanForUserException("The user has no loans");
		}
		
		return user.getLoans()
				.stream()
				.anyMatch( t -> t.getUdate().isBefore( LocalDateTime.now() )	);			
	}
}

