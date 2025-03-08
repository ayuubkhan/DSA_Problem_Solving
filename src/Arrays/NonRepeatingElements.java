package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonRepeatingElements {
    public static void main(String[] args) {

        int arr[] = new int[] {10, 30, 40, 20, 10, 20, 50, 10};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] != arr[i]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
