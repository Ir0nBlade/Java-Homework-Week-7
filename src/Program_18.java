// 18. Write a Java program to sum values of an array.

public class Program_18 {

    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("The sum of Array is: " + sum);
    }
}

/* Using Scanner Class

public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }

        System.out.println("Sum of array elements is: " + sum);
    }
 */
