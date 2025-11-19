package Curs5;

import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            if(number == 0) {
                break;
            }

            sum = sum + number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average = " + average);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}
