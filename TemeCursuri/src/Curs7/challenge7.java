package Curs7;

import java.time.LocalDate;

public class challenge7 {
    public static LocalDate addWeeksToToday(int weeks) {
        return LocalDate.now().plusWeeks(weeks);
    }

    public static void main(String[] args) {
        LocalDate today = addWeeksToToday(4);
        System.out.println(today);
    }
}
