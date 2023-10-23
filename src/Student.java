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
            System.out.println(Admin.questions[i].getQuesNo() + ") " + Admin.questions[i].getQuestionDesc() + "? " + "Options: " + Admin.questions[i].getOptions());
            System.out.println("Press 1 to answer the question or press 0 to skip the question");
            int skip;
            skip = scanner.nextInt();
                    scanner.nextLine();
            if(skip == 1){
                System.out.println("Enter the option Number");
                answers[i] = scanner.nextInt();
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


