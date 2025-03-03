package SortingMethods;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, -3, 9, 1, 4, 8, 2, 6, 5};
        System.out.println(Arrays.toString(insSort(arr)));
    }

//    static int[] insSort(int[]arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i+1; j > 0 ; j--) {
//                if (arr[j] < arr[j-1]) {
//                    SelectionSort.swap(arr,j,j-1);
//                } else {
//                    break;
//                }
//            }
//        }
//        return arr;
//    }

    static int[] insSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    SelectionSort.swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
