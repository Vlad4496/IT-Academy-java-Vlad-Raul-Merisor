package Curs7;

import java.time.LocalDate;

public class challenge3 {
    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();
        System.out.println(date);
    }
}
