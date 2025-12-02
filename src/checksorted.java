public class checksorted {
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5};

        checksorted obj = new checksorted(); // create object to call non-static method
        boolean result = obj.check(nums);

        System.out.println("Is array sorted and rotated? " + result);
    }

    public boolean check(int[] nums) {
        int n = nums.length;
        int countOutOfOrder = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                countOutOfOrder++;
            }
        }

        return countOutOfOrder <= 1;
    }
}
