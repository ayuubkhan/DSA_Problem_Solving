package Arrays;

import java.util.*;

public class NonRepeatingElements {
    public static void main(String[] args) {

//        Using Brute Force
        List<Integer> singleElem = new ArrayList<>();
        int arr[] = new int[] {10, 30, 40, 20, 10, 20, 50, 10};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                singleElem.add(arr[i]);
            }
        }
        System.out.println(singleElem);

//        Using HashMap

        Map<Integer,Integer> chequeRepeatElem = new HashMap<>();
        for (int num : arr) {
            chequeRepeatElem.put(num,chequeRepeatElem.getOrDefault(num,0) + 1);
        }

        List<Integer> NonRepeatElem = new ArrayList<>();
        for (int num : arr) {
            if (chequeRepeatElem.get(num) == 1) {
                NonRepeatElem.add(num);
            }
        }

        System.out.println(NonRepeatElem);
    }
}
