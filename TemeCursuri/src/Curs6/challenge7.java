package Curs6;

public class challenge7 {
    public static void main(String[] args) {
        String input = "balloon";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
