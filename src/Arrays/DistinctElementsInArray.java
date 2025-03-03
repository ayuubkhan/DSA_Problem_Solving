package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElementsInArray {
    public static void main(String[] args) {

        int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
        int k = 3;
        int distctCount = 0;
        List<Integer> singArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (singArr.contains(arr[i])) {
                continue;
            } else {
                distctCount+= 1;
                singArr.add(arr[i]);
            }
        }
        System.out.println(distctCount);

//        Using HashSet
//        Set<Integer> chequeUnique = new HashSet<>();
//        for (int num: arr) {
//            chequeUnique.add(num);
//        }
//
//        System.out.println(chequeUnique.size());
    }
}
