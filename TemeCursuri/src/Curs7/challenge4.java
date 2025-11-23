package Curs7;

import java.time.LocalDate;
import java.util.Scanner;

public class challenge4 {
    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        return date1.equals(date2);
    }

    public static void main(String[] args) {
        boolean result = areDatesEqual();
        System.out.println(result);
    }
}
