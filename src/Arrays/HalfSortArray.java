package Arrays;

import java.util.Arrays;

public class HalfSortArray {

    static void sortAscDsc(int[] arr, int len) {

//        for (int i = 0; i < len - 1; i++) {
//            for (int j = 0; j < len/2; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//
//            for (int j = (len/2) + (len % 2); j < len - 1 ; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        for (int i = 0; i < len / 2; i++) {
            for (int j = 0; j < (len / 2) - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sorting second half in descending order (Bubble Sort)
        for (int i = 0; i < (len / 2); i++) {
            for (int j = (len / 2) + (len % 2); j < len - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }


    static void inBuiltSortAscDes(int[] arr,int len) {
        Arrays.sort(arr);

        for (int i = 0; i < len / 2; i++) {
            System.out.print(arr[i]+" ");
        }

        if (len % 2 == 1) {
            System.out.print(arr[len / 2]+" ");
        }

        for (int i = len - 1 ; i >= (len / 2) + (len % 2); i--) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 1, 30, 40, 20, 10, 5};
        sortAscDsc(arr, arr.length);

//        Sort Arrays using inbuilt sort method and then print the first half in ascending and second half in descending
        inBuiltSortAscDes(arr,arr.length);
    }
}
