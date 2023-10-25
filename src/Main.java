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
        System.out.println("Enter the no of questions to be created in the quiz");
        Scanner scanner = new Scanner(System.in);
        int noOfQues = scanner.nextInt();
        //to create Questions by admin
        a.createQuestion(noOfQues);
        a.displayQuiz();

        Student s = new Student();
        s.playQuiz();
        s.calculateScore();
        boolean flag = true;
        while (flag) {

            System.out.println("please review and select the options         " +
                    "\n  " +
                    "\n 1 - To view correct Answers         " +
                    "\n 2 - To replay the quiz       " +
                    "\n 3 - To end the quiz        "
            );

            Scanner scan = new Scanner(System.in);
            int opt = scan.nextInt();
            switch (opt) {
                case 1:
                    a.printCorrectAnswer();
                    break;
                case 2:
                    s.replayQuiz(s);
                    break;
                case 3:
                    s.endQuiz();
                    flag = false;
                    break;

            }

        }


    }


}