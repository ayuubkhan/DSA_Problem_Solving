package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrequencyInArray {

    private static void countFrequency(int[] arr) {
        ArrayList<Integer> numberCheque = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (numberCheque.contains(arr[i])) {
                continue;
            } else {
                int temp = 0;
                int numberOne = arr[i];

                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == numberOne) {
                        temp++;
                    }
                }

                System.out.println(arr[i] + ":" + temp);
                numberCheque.add(arr[i]);
            }
        }
    }

//    static void countFrequency(int[] array)                    //TRICKY LOGIC
//    {
//        for (int i = 0; i < array.length; i++){
//            int flag = 0;
//            int count = 0;
//
//            for (int j = i+1; j < array.length; j++){
//                if (array[i] == array[j]){
//                    flag = 1;
//                    break;
//                }
//            }
//
//            if (flag == 1)
//                continue;
//
//            for (int j = 0;j<=i;j++){
//                if (array[i] == array[j])
//                    count++;
//            }
//            System.out.println(array[i]+": "+count);
//        }
//    }


//    private static void countFrequency(int[] arr) {                          // Optimized Way
//        HashMap<Integer,Integer> freqMap = new HashMap<>();
//
//        for (int num : arr) {
//            freqMap.put(num,freqMap.getOrDefault(num,0) + 1);
//        }
//
//        for (int num : freqMap.keySet()) {
//            System.out.println(num+" : "+freqMap.get(num));
//        }
//    }




    public static void main(String[] args) {
        int[] arr = {10,10,10,20,10,30,40,40};
        countFrequency(arr);
    }

}
