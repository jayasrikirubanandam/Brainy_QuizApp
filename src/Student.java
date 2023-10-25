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

        a:
        for (int i = 0; i < quizSize; i++) {
            System.out.println(Admin.questions[i].getQuesNo() + ") " + Admin.questions[i].getQuestionDesc() + "? ");
            String[] op = Admin.questions[i].getOptions();
            System.out.println("Options: ");
            for (int j = 0; j < op.length; j++) {

                System.out.println(j + 1 + ")" + op[j]);
            }

            // if user press any other data rather than numbers eg String
            b:
            while (true) {

                System.out.println("Press 1 to answer the question or press 0 to skip the question");
                int skip;

                if (scanner.hasNextInt()) {

                    skip = scanner.nextInt();
                    scanner.nextLine();
                    if (skip == 1) {
                        //if user press any other no rather 1 0r 0
                        while (true) {
                            System.out.println("Enter the option Number to select the correct answer ");
                            //logic to make sure the answer accepts oly numbers
                            if (scanner.hasNextInt()) {
                                answers[i] = scanner.nextInt();
                                break b;
                            } else {
                                System.out.println("Answer accepts only numbers. Please enter the option Number(1-4) to select the correct answer");
                                scanner.nextLine();
                            }
                        }


                    } else if (skip == 0) {
                        //answers[i] = ;
                        continue a;
                    } else {
                        System.out.println("Invalid input");
                        continue b;

                    }

                } else {
                    scanner.nextLine();
                    System.out.println("Invalid Input, accepts either 1 or 0");
                    scanner.nextLine();
                }
            }


        }

    }

    public void calculateScore() {

        a:
        for (int i = 0; i < quizSize; i++) {
// == operator works if values are equal , chaos if values are diff
            int comparedValue = Integer.compare(Admin.correctAnswer[i], answers[i]);
            if (comparedValue == 0) {
                score += 2;
            } else if (comparedValue == 1 || comparedValue == -1) {
                score -= 1;
            }
        }
        System.out.println("score " + score);
        //if score is negative , make it 0 to calculate the score.percentage cannot be calculated if the score is in -ve value
        if (score > 0) {

            double percentage = ((double) score / (quizSize * 2)) * 100;

            if (percentage >= 50) {
                System.out.println("Congratulations!! , You have played well and passed the quiz. Your score is : " + percentage);

            } else {
                System.out.println("Better Luck next Time, Your score is : " + percentage);

            }
        } else {
            System.out.println("Better Luck next  Time, Your score is : " + " 0.0");
        }


    }

    public void replayQuiz(Student s) {

        //to play the quiz again by the student used do-while
        boolean flag = true;

        while (flag) {

            System.out.println("Do you want to play Again? (yes/no): ");

            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase(("no"))) {
                flag = false;
                break;
            }

            //for every replay we need to reset the score to 0
            score = 0;
            s.playQuiz();
            s.calculateScore();
            //  scanner.nextLine(); //clear newline character

        }

    }

    public void endQuiz() {
        System.out.println("Thank you for playing the quiz");
    }


}


