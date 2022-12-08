import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("This is a Number Guessing Game!");
        System.out.println("Enter the minimum that you want: ");
        int minimum = scan.nextInt();
        System.out.println("Enter the maximum that you want: ");
        int maximum = scan.nextInt();

        Computer comp1 = new Computer(maximum, minimum);
        comp1.randomNum();
        System.out.println("Enter your guess: (and we will tell you Higher or Lower) ");
        int guess = scan.nextInt();
    }
}