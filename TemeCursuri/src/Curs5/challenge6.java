package Curs5;

import java.util.Scanner;

public class challenge6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int num = scan.nextInt();
        int sum = 0;

        while(num != -1){
            sum += num;
            System.out.print("Enter a number (-1 to stop): ");
            num = scan.nextInt();
        }
        System.out.println("The sum is: " + sum);

    }
}
