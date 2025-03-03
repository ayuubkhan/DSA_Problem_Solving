package SortingMethods;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, -3, 9, 1, 4, 8, 2, 6, 5};
        System.out.println(Arrays.toString(selSort(arr)));
    }


//    static int[] selSort(int[] arr) {
//        for (int i = 0; i < arr.length - 1 ; i++) {
//            int smallest = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[smallest]) {
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//        return arr;
//    }

    static int[] selSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }



    /*
    static int[] selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
     */

//    static int[] selSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int last = arr.length - 1 - i;
//            int maxIndex = getMaxIndex(arr,0,last);
//            swap(arr,maxIndex,last);
//        }
//        return arr;
//    }
//
//
//    static int getMaxIndex(int[] arr, int start,int last) {
//        int max = start;
//        for (int i = start; i <= last ; i++) {
//            if (arr[max] < arr[i]) {
//                max = i;
//            }
//        }
//        return max;
//    }
//
    static void swap(int[] arr,int first,int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
