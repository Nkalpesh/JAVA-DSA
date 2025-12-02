
import java.util.*;

    public class Linearsearch {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter target value: ");
            int target = sc.nextInt();

            // Linear Search
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
