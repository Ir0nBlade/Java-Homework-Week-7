
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Program_1 {

    // Method to find odd or even
    public static void oddOrEven(int num) {

        String oddeven = (num % 2 == 0) ? "Even" : "Odd"; // odd even with Ternary operator
        System.out.println(num + " is " + oddeven + " number");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to check Odd or Even number: ");
        int num = scan.nextInt();

        oddOrEven(num);
    }

}
