public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-25,-2,-1,2,3,5,15,22,25};
        int target = 2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            } else if ( target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
