package Linear_Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
//        int[] arr = {48,36,20,14,12,11,9,6,4,2};
        System.out.println(orderAgonsticBinarySearch(arr,36));
    }


    static int orderAgonsticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
