package quizApp;

public class Hard implements Questions{
        String[] questions = {"Which concept in OOP is best described as data hiding?","What allows an object to take on many forms in OOP?"};
        String [][] options = {{"Inheritance","Encapsulation","Polymorphism", "Association"},{"Abstraction","Instantiation","Encapsulation", "Polymorphism"}};
        int [] correctAnswer = {1,3};

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
