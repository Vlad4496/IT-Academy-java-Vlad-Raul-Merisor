package Curs5;

import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if(number >= 1 && number <= 12) {
            System.out.println(months[number - 1]);
        } else {
            System.out.println("Invalid input");
        }
    }
}
