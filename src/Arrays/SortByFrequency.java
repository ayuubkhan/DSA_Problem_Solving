package Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class SortByFrequency {

    private static void sortFrequency(int[] arr) {
        HashMap<Integer,Integer> numberFreq = new HashMap<>();
        ArrayList<Integer> numberInfreq = new ArrayList<>();

        for (int num : arr) {
            numberFreq.put(num,numberFreq.getOrDefault(num,0) + 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,10,10,20,10,30,40,40};
        sortFrequency(arr);
    }
}
