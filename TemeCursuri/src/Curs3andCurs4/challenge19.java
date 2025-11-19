package Curs3andCurs4;

import java.util.Scanner;

public class challenge19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        String category =
                (age < 12) ? "Child":
                    (age <= 17) ? "Teenager":
                        (age <= 64) ? "Adult":
                                        "Senior";
        System.out.println("Category: " + category);

    }
}
