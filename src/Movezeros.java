public class Movezeros {
    public static void main(String[] args) {
        Solution sol = new Solution();   // Create object of Solution
        int[] nums = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums);           // Call function

        // Print the result
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}

class Solution {
    // Function to move zeroes to the end
    public void moveZeroes(int[] nums) {
        // Pointer to the first zero
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return
        if (j == -1) return;

        // Start from next index of first zero
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) { // If current element is non-zero
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
