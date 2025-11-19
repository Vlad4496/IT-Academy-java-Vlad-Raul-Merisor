package Curs5;

import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter a number: ");
            int number =  sc.nextInt();
            if(number < 5) {
                continue;
            }
            sum = sum + number;

            System.out.println(sum);
        }
    }
}
