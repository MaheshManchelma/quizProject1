package quizApp;

public interface Questions{
       void displayQuestions(int quesNo);
       void calculateScore(int selectedOptionIndex, int quesNo); 
       int getNumberOfQuestions();

}
