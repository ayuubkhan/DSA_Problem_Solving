package TCS;

import java.util.ArrayList;
import java.util.List;

public class subArray {
    public static void main(String[] args) {
        int arr [] = {10, 30, 40, 20, 10, 20, 50, 10};
        int k = 3;
        List<Integer> subArr = new ArrayList<>();
        for (int i = 0; i <= arr.length - k; i++) {
            int biggest = arr[i];
            for (int j = i+1; j < i+k; j++) {
                if (arr[j] > biggest) {
                    biggest = arr[j];
                }
            }
            subArr.add(biggest);
        }

        System.out.println(subArr);
    }
}
