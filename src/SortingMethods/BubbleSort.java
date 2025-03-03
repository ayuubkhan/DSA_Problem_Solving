package SortingMethods;

import java.util.Arrays;

import static SortingMethods.CycleSort.sort;

/*
🔵 Bubble Sort - Explained Simply
    Bubble Sort is a simple sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order. This process continues until the array is fully sorted.

💡 Think of it like bubbles in water:
    The largest elements "bubble up" to the top (end of the array) in each pass.
    Smaller elements move down (like sinking bubbles) until everything is in order.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1, 4, 8, 2, 6, 5};
//        sort(arr);
        System.out.println(Arrays.toString(sort(arr)));
    }

    /*
    static void sort (int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1 ] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        if (!swapped) {
            System.out.println("Array is already sorted, no need of swapping the elements");
        } else {
            for (int a : arr) {
                System.out.println(a);
            }
        }
    }
    */


    /*
    static int[] sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
     */

    /*
    static int[] sort (int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    SelectionSort.swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
    */


    static int[] sort(int arr[]) {          //✅ Optimized Bubble Sort Code (Best Version)
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

}
