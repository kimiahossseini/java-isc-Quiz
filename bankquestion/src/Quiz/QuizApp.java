package Quiz;

import java.util.Scanner;

public class QuizApp {

	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Select a quiz:");
	        System.out.println("1. Java Quiz");
	        System.out.println("2. General Knowledge Quiz");
	        System.out.print("Enter your choice (1 or 2): ");
	        int choice = scanner.nextInt();

	        BaseQuiz quiz;
	        if (choice == 1) {
	            quiz = new JavaQuiz();
	        } else {
	            quiz = new GeneralKnowledgeQuize();
	        }

	        quiz.startQuiz();
	        scanner.close();
	    }

	}


