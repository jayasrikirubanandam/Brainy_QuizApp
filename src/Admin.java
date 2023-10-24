import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class Admin {


    static  Question[] questions;
    static int[] correctAnswer ;

    Scanner scanner = new Scanner(System.in);

    //To create questions by the admin for the Quiz
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

                    System.out.println("Invalid, Question Number accepts numbers only. please enter the valid number ");
                    scanner.nextLine();   // why this-> because the when you press enter,it creates the empty string and that has been taken has a value for the next scanner (i.e)question

                }
               // scanner.nextLine();// explicitly need to clear the new line character which was entered previously

        }

            scanner.nextLine();
            System.out.println("Enter the question");
            String ques = scanner.nextLine();

            System.out.println("Enter the options");
            String[] opt  = new String[4];
            for (int j = 0; j < opt.length; j++) {

                System.out.print(j+1 +")" );
                opt[j] =  scanner.nextLine();

            }


            System.out.println("Enter the option numbers (1-4) to select the correct answer");
            int answer=0;

            while(true){

                if(scanner.hasNextInt()){
                     answer = scanner.nextInt();
                     break;

                }else{
                    System.out.println("Invalid, answer accpets only values between (1-4) ");
                    scanner.nextLine();
                }
            }


            correctAnswer [i]= answer;
            questions[i] = new Question(quesNo, ques, opt, answer);

        }

    }




    public void displayQuiz() {

        System.out.println("********************************************************");
        System.out.println("   ");
        System.out.println("The No of Questions entered by the admin  ");

        for(Question q: questions){

            System.out.println(q.getQuesNo() + ") " + q.getQuestionDesc() + "? " );
            String[] op = q.getOptions();
            for(int i=0;i<op.length;i++){

                System.out.println(i+1 +")"+ op[i] );
            }


        }

    }


}
