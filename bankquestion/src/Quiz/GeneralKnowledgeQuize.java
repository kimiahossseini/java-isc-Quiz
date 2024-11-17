package Quiz;

import question.MultipleChoiceQuestion;
import question.Question;
import question.TrueFalseQuestion;

public class GeneralKnowledgeQuize extends BaseQuiz  {
	 @Override
	    protected Question[] getQuestions() {
	        return new Question[]{
	            new MultipleChoiceQuestion("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris"}, 2),
	            new TrueFalseQuestion("The Earth is flat.", false),
	            new MultipleChoiceQuestion("Which planet is known as the Red Planet?", new String[]{"Earth", "Mars", "Jupiter"}, 1)
	        };
	    }
	

}
