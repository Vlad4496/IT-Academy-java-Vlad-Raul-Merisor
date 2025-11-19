package Curs6;

public class challenge2 {
    public static void main(String[] args) {
        String original = "level";
        StringBuilder str = new StringBuilder(original);
        String reversed = str.reverse().toString();

        if(original.equals(reversed)){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
