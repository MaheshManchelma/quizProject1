package quizApp;
import java.util.Scanner;


public class start {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Questions quiz; // Using the interface as a reference type
        
                System.out.println("Select the quiz level:");
                System.out.println("1. Basic");
                System.out.println("2. Intermediate");
                System.out.println("3. Advance");
        
                int choice = sc.nextInt();
                switch (choice) {
                        case 1:
                            quiz = new Basic();
                            break;
                        case 2:
                            quiz = new Medium(); // Assuming you have this class.
                            break;
                        case 3:
                            quiz = new Hard(); // Assuming you have this class.
                            break;
                        default:
                            System.out.println("Invalid choice. Exiting...");
                            sc.close();
                            return;
                    }
                    

        for (int i = 0; i < quiz.getNumberOfQuestions(); i++) { 
            quiz.displayQuestions(i); // Display each question.
            System.out.println("Enter the number of your answer (1-4):");
            int userSelection = sc.nextInt() - 1; // Convert to 0-based index
            quiz.calculateScore(userSelection, i); // Pass the 0-based index to the method
        }

        sc.close(); // Close the scanner at the end.
    }
}

