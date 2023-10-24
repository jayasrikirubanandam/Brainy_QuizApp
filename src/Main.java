import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Admin a = new Admin();
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Welcome to the BRAINY BOWL 2023 (QUIZ APP) ");
        System.out.println("You are the TRAINER now.");
        System.out.println("Please enter the following data to create question!! ");
        System.out.println(" ");

        //to create Questions by admin
        a.createQuestion(3);
        a.displayQuiz();

        //to play the quiz again by the student used do-while
        do{

            Student s = new Student();
            s.playQuiz();
            s.calculateScore();


            System.out.println("Do you want to play Again? (yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String  playAgain = scanner.next();
            if(playAgain.equalsIgnoreCase(("no"))){
                break;
            }
          //  scanner.nextLine(); //clear newline character

        }while(true);
        System.out.println("Thank you for playing the quiz");

    }

}