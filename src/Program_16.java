/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

import java.util.Scanner;

public class Program_16 {

    public static void positiveNegative(int num) {

        if (num > 0) { //checks the number is greater than 0 or not
            System.out.println("The number is Positive");
        } else if (num < 0) { //checks the number is less than 0 or not
            System.out.println("The number is Negative");
        } else { // Execute when above two conditions are false
            System.out.println("Number is Zero");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        positiveNegative(num);
    }
}
