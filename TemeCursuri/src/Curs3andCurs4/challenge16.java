package Curs3andCurs4;

public class challenge16 {
    public static void main(String[] args) {
        int number = 50;

        number = -number;
        System.out.println("After negation: " + number);

        number = Math.abs(number);
        System.out.println("After absolute value: " + number);

        number++;
        System.out.println("After increment: " + number);
    }
}
