package Arrays;

import GettingStarted.GreatestOfThree;

public class SmallestInArray {
    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 7, 9, 3, 1};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);

//        Using recursion
        System.out.println(getSmallestArr(arr,arr.length));

    }

//    static int getSmallestArr(int [] arr, int i) {
//        if (i == 1) {
//            return arr[0];
//        }
//
//        int smallest = getSmallestArr(arr,i-1);
//
//        return  arr[i - 1] < smallest ? arr[i - 1] : smallest;
//    }

    static int getSmallestArr(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int min = getSmallestArr(arr,n-1);

        return arr[n - 1] < min ? arr[n-1] : min;
    }


}
