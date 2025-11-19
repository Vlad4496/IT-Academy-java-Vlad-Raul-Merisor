package Curs3andCurs4;

import java.util.ArrayList;

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
