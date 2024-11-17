package Quiz;

import question.MultipleChoiceQuestion;
import question.Question;
import question.TrueFalseQuestion;

public class JavaQuiz extends BaseQuiz {
	   @Override
	    protected Question[] getQuestions() {
	        return new Question[]{
	            new MultipleChoiceQuestion("What is the size of an int in Java?", new String[]{"16 bits", "32 bits", "64 bits"}, 1),
	            new TrueFalseQuestion("Java is a platform-independent language.", true),
	            new MultipleChoiceQuestion("Which of the following is not a Java keyword?", new String[]{"class", "method", "static"}, 1)
	        };
	    }

}
