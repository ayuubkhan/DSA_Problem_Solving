package Arrays;

import java.util.*;

public class RepeatingElements {
    public static void main(String[] args) {
        int arr[] = new int[] {10, 30, 30, 20, 10, 20, 50, 10};
        /*
//      Using Sorting method
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }

                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            while (i < arr.length - 1 && arr[i] == arr[i+1]) {
                flag = 1;
                i++;
            }

            if (flag == 1) {
                System.out.println(arr[i]);
            }
        }
         */


//        Using Brute Force Approach
        List<Integer> repeatedElem = new ArrayList<>();

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (repeatedElem.contains(arr[i])) {
                    continue;
                } else {
                    if (arr[i] == arr[j] && !repeatedElem.contains(arr[i])) {
                        repeatedElem.add(arr[i]);
                    }
                }
            }
        }
        System.out.println(repeatedElem);

//        Using HashSet
        Set<Integer> seen = new HashSet<>();
        List<Integer> repeatElem = new ArrayList<>();

        for (int num : arr) {
            if (seen.contains(num) && !repeatElem.contains(num)) {
                repeatElem.add(num);
            } else {
                seen.add(num);
            }
        }
        System.out.println(repeatElem);
    }
}
