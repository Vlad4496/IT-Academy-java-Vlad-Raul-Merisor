package Curs6;

public class challenge6 {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("The cat sat on the mat!");

        int indexCat = sentence.indexOf("cat");
        sentence.replace(indexCat, indexCat+3, "dog");

        int indexSat = sentence.indexOf("sat");
        sentence.replace(indexSat, indexSat+3, "jumped");

        int indexMat = sentence.indexOf("mat");
        sentence.replace(indexMat, indexMat+3, "couch");

        System.out.println(sentence);
    }
}
