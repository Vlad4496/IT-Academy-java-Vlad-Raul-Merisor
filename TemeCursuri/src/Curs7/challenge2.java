package Curs7;

import java.time.LocalDate;

public class challenge2 {
    public static void main(String[] args) {
        LocalDate displayDateComponents =  LocalDate.now();

        System.out.println("Month: " + displayDateComponents.getDayOfWeek());
        System.out.println("Year: " + displayDateComponents.getYear());
        System.out.println("Day: " + displayDateComponents.getDayOfMonth());
    }
}
