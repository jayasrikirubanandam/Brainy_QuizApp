
public class Main {
    public static void main(String[] args) {

        Admin a = new Admin();
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        System.out.println("Welcome to the BRAINY BOWL 2023 (QUIZ APP) ");
        System.out.println("You are the TRAINER now.");
        System.out.println(" ");

        a.createQuestion(2);
        a.displayQuiz();

        Student s = new Student();
        s.playQuiz();
        s.calculateScore();


    }
}