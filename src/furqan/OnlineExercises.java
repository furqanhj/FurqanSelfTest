package furqan;

import java.util.Scanner;

public class OnlineExercises {

    public static void main(String[] args) {

        String sentence = "Broccoli is delicious";
        String firstWord;
        String secondWord;
        int start;
        int end;

        firstWord = sentence.substring(0, sentence.indexOf(" "));
        System.out.println("First Word is: " + firstWord);
        secondWord = sentence.substring(sentence.indexOf(" "), 0);
        System.out.println("Second Word is: " + secondWord);
    }
}


