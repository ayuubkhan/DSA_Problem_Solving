package Arrays;

public class LargestInArray {
    public static void main(String[] args) {
//        int arr[] = {3,6,8,7,1,3,9};
//        int larget = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > larget) {
//                larget = arr[i];
//            }
//        }
//
//        System.out.println(larget);

//        Using Recursion
        int arr[] = {3, 6, 8, 7, 9, 3, 1};
        int largest = findLargest(arr, arr.length);
        System.out.println("Largest element: " + largest);
    }

    private static int findLargest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int max = findLargest(arr, n-1);

        if (arr[n-1] > max) {
            return arr[n-1];
        } else {
            return max;
        }
    }

//    static int findLargest(int[] arr, int n) {
//        if (n == 1) {
//            return arr[0];
//        }
//
//        int max = findLargest(arr,n-1);
//
//        if (arr[n-1] > max) {
//            return arr[n-1];
//        } else {
//            return max;
//        }
//    }


}
