package SortingMethods;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
//    static int[] sort(int[]arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int corIndex = arr[i] -1;
//            if (arr[i] != arr[corIndex]) {
//                SelectionSort.swap(arr,i,corIndex);
//            } else {
//                i++;
//            }
//        }
//        return arr;
//    }

    static int[] sort(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            int currIndex = arr[i] - 1;
            if (arr[i] != arr[currIndex]) {
                SelectionSort.swap(arr,i,currIndex);
            } else {
                i++;
            }
        }
        return arr;
    }
}
