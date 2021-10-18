// 17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
import java.util.Collections;

public class Program_17 {

    public static void main(String[] args) {

        // Array type numeric
        Integer[] numarray = {
                89, 13, 20, 28, 23, 78, 72, 65, 1, 9};

        // Array type string
        String[] stringarray = {
                "India", "UK", "US", "Germany", "France", "Spain", "Dubai", "Africa", "Italy", "Iceland"};

        System.out.println("Original numeric array: " + Arrays.toString(numarray));
        Arrays.sort(numarray); // Sort numeric array in Ascending order
        System.out.println("Sorted numeric array in Ascending order: " + Arrays.toString(numarray));
        Arrays.sort(numarray, Collections.reverseOrder()); // Sort array in decending array
        System.out.println("Sorted numeric array in Decending order: " + Arrays.toString(numarray));

        System.out.println("");

        System.out.println("Original string array: " + Arrays.toString(stringarray));
        Arrays.sort(stringarray); // Sort string array in Ascending order
        System.out.println("Sorted string array in Ascending order: " + Arrays.toString(stringarray));
        Arrays.sort(stringarray, Collections.reverseOrder()); // Sort array in decending array
        System.out.println("Sorted string array in Decending order" + Arrays.toString(stringarray));

    }
}

