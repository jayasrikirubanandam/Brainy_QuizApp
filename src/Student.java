import java.util.Scanner;

public class Student {

    Admin admin = new Admin();
    int[] answers;
    int quizSize = Admin.questions.length;
    int score = 0;


    Scanner scanner = new Scanner(System.in);
    public void playQuiz() {

        answers = new int[quizSize];

        System.out.println("********************************************************");
        System.out.println("You are the student now, please read the question carefully and answer the following");
        System.out.println(" ");

       a: for (int i = 0; i < quizSize; i++) {
            System.out.println(Admin.questions[i].getQuesNo() + ") " + Admin.questions[i].getQuestionDesc() + "? ");
           String[] op = Admin.questions[i].getOptions();
           System.out.println("Options: ");
           for(int j=0;j<op.length;j++){

               System.out.println(j+1 +")"+ op[j] );
           }

            System.out.println("Press 1 to answer the question or press 0 to skip the question");
            int skip;
            skip = scanner.nextInt();
                    scanner.nextLine();
            if(skip == 1){
                while(true){
                    System.out.println("Enter the option Number to select the correct answer ");
                    //logic to make sure the answer accepts oly numbers
                    if(scanner.hasNextInt()){
                        answers[i] = scanner.nextInt();
                        break;
                    }else{
                        System.out.println("Answer accepts only numbers. Please enter the option Number(1-4) to select the correct answer");
                        scanner.nextLine();
                    }
                }


            }
            else if(skip == 0){
                //answers[i] = ;
                continue a;
            }

        }

    }

    public void calculateScore() {


       a: for (int i = 0; i < quizSize; i++) {

            if(admin.correctAnswer[i] == answers[i]){
                    score += 2;
                } else {
                    score -= 1;
                }
            }
        System.out.println("The score you earned is :" + score);



        }




    }


