package Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {10, 30, 40, 20};
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("Array is already sorted");
                return;
            }
        }

//        if (swapped)
            System.out.println(Arrays.toString(arr));
    }
}
