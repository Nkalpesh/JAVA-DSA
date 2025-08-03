public class SearchInsert { public static void main(String[] args) {
    int[] nums = {-25, -2, -1, 2, 3, 5, 15, 22, 25};
    int target = 4;
    int ans = searchInsert(nums, target);
    System.out.println(ans);
}


    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end; // they give you index

    }
}








