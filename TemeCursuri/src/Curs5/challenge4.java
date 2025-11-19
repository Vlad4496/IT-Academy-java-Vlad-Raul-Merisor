package Curs5;

import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String text = input.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
    }
}
