package Curs3;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Java");
        listOne.add("C#");
        ArrayList<String> listTwo = listOne;

        System.out.println(listOne);
        System.out.println(listTwo);
    }
}
