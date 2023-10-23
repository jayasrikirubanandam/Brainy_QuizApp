import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Admin {


    static  Question[] questions;
    static int[] correctAnswer ;
    String[] opt  = new String[4];
    Scanner scanner = new Scanner(System.in);

    public void createQuestion(int noOfQuestions) {

        questions = new Question[noOfQuestions];
        correctAnswer = new int[noOfQuestions];

        for (int i = 0; i < questions.length; i++) {
            int quesNo =0;

            //logic to make user enter int type for questionNo;
            while(true){

                System.out.println("Enter the questionNo");
                //quesNo has to be only in int - validation required
                if(scanner.hasNextInt()){
                   quesNo = scanner.nextInt();
                   break;
                }else{

                    System.out.println("Hello Admin, Question Number can accepts numbers only. please enter the valid number ");
                    scanner.nextLine();   // why this-> because the when you press enter,it creates the empty string and that has been taken has a value for the next scanner (i.e)question

                }

        }

            scanner.nextLine();
            System.out.println("Enter the question");
            String ques = scanner.nextLine();

            System.out.println("Enter the options");


            for (int j = 0; j < opt.length; j++) {

                System.out.print(j+1 +")" );
                opt[j] =  scanner.nextLine();

            }


            System.out.println("Enter the option numbers (1-4) ");
            int answer = scanner.nextInt();

            correctAnswer [i]= answer;
            questions[i] = new Question(quesNo, ques, opt, answer);

        }

    }


    public void displayQuiz() {

        System.out.println("********************************************************");
        System.out.println("   ");
        System.out.println("The No of Questions entered by the admin  ");

//        for (int i = 0; i < questions.length; i++) {
//
//            System.out.println(questions[i].getQuesNo() + ") " + questions[i].getQuestionDesc() + "? " );
//
//                for(int j=0;j< opt.length;j++){
//                    System.out.println(j+1 +") " + opt[j] );
//                }
//
//        }

        for(Question q: questions){

            System.out.println(q.getQuesNo() + ") " + q.getQuestionDesc() + "? " );
            for(int i=0;i< opt.length;i++){

                System.out.println(q.options[i]);
            }

        }

    }


}
