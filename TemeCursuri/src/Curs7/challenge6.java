package Curs7;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class challenge6 {
    public static LocalTime displayCurrentTime () {
        LocalTime now = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return LocalTime.parse(now.format(dtf));
    }

    public static void main(String[] args) {
        LocalTime result = displayCurrentTime();
        System.out.println(result);
    }
}
