
// 12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program_12 {

    public static void checkValue(char ch) {

        // Checking for Alphabet
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
            System.out.println("Entered Character is Alphabet");

            // Checking for Digit
        else if (ch >= 48 && ch <= 122)
            System.out.println("Entered Character is Digit");

        else
            System.out.println("Entered Character is Special Character");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value to check Alphabet or Digit or Special Character: ");
        char ch=scan.next().charAt(0);
        checkValue(ch);

    }
}
