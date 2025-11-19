package Curs6;

public class challenge4 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sternocleidomastoidian");

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                str.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(str);


    }
}
