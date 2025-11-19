package Curs5;

import java.util.Arrays;

public class challenge3 {
    public static void main(String[] args) {
        int[] array = {1, -5, 25, -60, -75, 100, 250, -768, 999};

//        First option
        Arrays.stream(array).filter(x -> x < 0).forEach(System.out::println);

//        Second option
        for(int num : array) {
            if(num < 0) {
                System.out.println(num);
            }
        }
    }
}
