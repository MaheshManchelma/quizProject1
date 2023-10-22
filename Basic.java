package quizApp;

public class Basic implements Questions{
        String[] questions = {"Question.1 Which of the following is not a primitive data type in Java?","Question.2 What does the '++' operator do in Java?"};
        String [][] options = {{"int","char","String", "boolean"},{"Substraction","addition","Increment by one", "Decrement by one"}};
        int [] correctAnswer = {2,2};

          @Override
    public void displayQuestions(int quesNo) {
        System.out.println(questions[quesNo]);
        for (int j = 0; j < options[quesNo].length; j++) {
            System.out.println((j+1) + ". " + options[quesNo][j]);
        }
    }

    @Override
    public void calculateScore(int selectedOptionIndex, int quesNo) {
        if(selectedOptionIndex  == correctAnswer[quesNo]) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
    }
    @Override
  public int getNumberOfQuestions() {
    return questions.length;
}

}


