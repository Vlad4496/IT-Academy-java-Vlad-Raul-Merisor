package Curs3;

public class Challenge7 {
    public static void main(String[] args) {
        int sideOne = 25;
        int sideTwo = 25;
        int sideThree = 25;

        String type = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles"
                : "Scalene";

        System.out.println("The triangle is " + type);
    }
}
