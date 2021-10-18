
// 20. Write a Java program to test if an array contains a specific value.

public class Program_20 {

    public static void main(String[] args) {

        int[] array = {
                1415, 1920, 5657, 2021, 1516, 9099, 3167, 8888, 1011, 2022};

        System.out.println(contains(array, 8888));
        System.out.println(contains(array, 7777));
    }

    public static boolean contains(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
}
