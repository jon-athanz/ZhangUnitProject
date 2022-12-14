import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);


        do {

            int count = 0;
            boolean notWinner = true;

            System.out.println("This is a Number Guessing Game!"); // Unit 1, Requirement i
            System.out.println("What is your first name? ");
            String firstname = scan.next();
            System.out.println("Do you want to enter your own range or use the default range? Type (y/n)");
            String answer = scan.next();
            if (answer.equals("y")) {
                System.out.println("Enter the minimum that you want: ");
                int minimum = scan.nextInt();
                System.out.println("Enter the maximum that you want: ");
                int maximum = scan.nextInt();


                Computer comp1 = new Computer(maximum, minimum);
                comp1.randomNum();
                while (notWinner) {
                    System.out.println("Enter your guess: (and we will tell you Higher or Lower) ");
                    int guess = scan.nextInt();
                    comp1.numberChecker(guess);
                    System.out.println("");
                    notWinner = comp1.winnerChecker(guess);
                    count++;
                }
                comp1.setScore(count, firstname);
                System.out.println(comp1.toString());
                comp1.checkLeaderBoardScore(count, firstname);
                System.out.println(comp1.leaderBoard());
                System.out.println("");
            } else if (answer.equals("n")) {

                Computer comp1 = new Computer();
                comp1.randomNum();
                while (notWinner) {
                    System.out.println("Enter your guess: (and we will tell you Higher or Lower) ");
                    int guess = scan.nextInt();
                    comp1.numberChecker(guess);
                    System.out.println("");
                    notWinner = comp1.winnerChecker(guess);
                    count++;
                }
                comp1.setScore(count, firstname);
                System.out.println(comp1.toString());
                comp1.checkLeaderBoardScore(count, firstname);
                System.out.println(comp1.leaderBoard());
                System.out.println("");
            } else {
                System.out.println("Invalid Input!");
            }
            TimeUnit.SECONDS.sleep(2);
        } while (true);

    }
}