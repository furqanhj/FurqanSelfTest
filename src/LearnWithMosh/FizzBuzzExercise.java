package LearnWithMosh;

import java.util.Scanner;

public class FizzBuzzExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of your choice: ");
        int number = scanner.nextInt();

        if ((number % 5 == 0) && (number % 3 == 0))
            System.out.println("FIZZ-BUZZ");
        else if (number % 5 == 0)
            System.out.println("FIZZ");
        else if (number % 3 == 0)
            System.out.println("BUZZ");
        else
            System.out.println(number);
    }
}
