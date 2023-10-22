package quizApp;
public class Medium implements Questions{
        String[] questions = {"Which of the following concepts make Java a platform-independent language?","Which keyword is used in Java to inherit features of a parent class?"};
        String [][] options = {{"Garbage Collection","Polymorphism","Bytecode and JVM", "Encapsulation"},{"inherit","extends","implements", "include"}};
        int [] correctAnswer = {2,1};

          
        
        
        
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