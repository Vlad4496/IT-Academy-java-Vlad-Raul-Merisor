package Curs3;

public class challenge20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 30;

        int highestNumber = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(highestNumber);
    }
}
