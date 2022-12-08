import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        boolean notWinner = true;

        System.out.println("This is a Number Guessing Game!"); // Unit 1, Requirement i
        System.out.println("What is your name? ");
        String name = scan.nextLine();
        System.out.println("Do you want to enter your own range or use the default range? Type (y/n)");
        String answer = scan.nextLine();
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
                notWinner = comp1.winnerChecker(guess);
                count++;
            }
            System.out.println(name + "'s score = " + count);
            comp1.checkLeaderBoardScore(count, name);
            System.out.println(comp1.leaderBoard());
        } else {

            Computer comp1 = new Computer();
            comp1.randomNum();
            while (notWinner) {
                System.out.println("Enter your guess: (and we will tell you Higher or Lower) ");
                int guess = scan.nextInt();
                comp1.numberChecker(guess);
                notWinner = comp1.winnerChecker(guess);
                count++;
            }
            System.out.println(name + "'s score = " + count);
        }

    }
}