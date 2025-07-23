Largest and Smallest of Three Numbers in Java
import java.util.Scanner;

/*
 * Java Program to find largest and smallest of three numbers
 */
public class LargestANDsmallest {

    public static void main(String args[]) {

        // creating scanner to accept radius of circle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Java program to find largest and smallest of three numbers");

        System.out.println("Please enter first number :");
        int first = scanner.nextInt();

        System.out.println("Please enter second number :");
        int second = scanner.nextInt();

        System.out.println("Please enter third number :");
        int third = scanner.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n",
                first, second, third, smallest);

        scanner.close();
    }

    /**
     * Java method to calculate largest of three numbers
     *
     * @param first
     * @param second
     * @param third
     * @return maximum or largest of three
     */
    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }

        if (third > max) {
            max = third;
        }

        return max;
    }

    /**
     * Java method to calculate smallest of three numbers
     *
     * @param first
     * @param second
     * @param third
     * @return minimum or smallest of three
     */
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }

        if (third < min) {
            min = third;
        }

        return min;
    }
}
