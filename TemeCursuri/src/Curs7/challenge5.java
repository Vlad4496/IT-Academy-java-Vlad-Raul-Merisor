package Curs7;

import java.time.LocalDate;

public class challenge5 {
    public static boolean isTodaySpecificDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate targetDate = LocalDate.of(2019, 12, 10);
        return currentDate.equals(targetDate);
    }
    public static void main(String[] args) {
        boolean result = isTodaySpecificDate();
        System.out.println(result);
    }
}
