package Curs5;

import java.util.Scanner;

public class challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 42;  // predefined number
        int guess;

        System.out.println("Guess the number!");
        do {
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            if(guess > secretNumber) {
                System.out.println("Too high!");
            } else if(guess < secretNumber) {
                System.out.println("Too low!");
            }
        } while (guess != secretNumber);
        System.out.println("You guessed the number!");
    }
}
