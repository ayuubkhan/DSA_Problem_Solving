package Arrays;

public class SecondSmallestInArray {
    public static void main(String[] args) {
//        Using Two loop
        int arr[] = {12, 13, 1, 10};
//        int arr[] = {12, 13, 1, 10, 34, 10};
//        int smallest = arr[0];
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < smallest) {
//                smallest = arr[i];
//            }
//        }
//
//        int secondSmallest = Integer.MAX_VALUE;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] != smallest && arr[i] < secondSmallest){
//                secondSmallest = arr[i];
//            }
//        }
//
//        System.out.println("Second Smallest : "+secondSmallest);

//        Using one loop

        int firstsmall = Integer.MAX_VALUE, secSmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstsmall) {
                firstsmall = arr[i];
            }
            if (arr[i] != firstsmall && arr[i] < secSmall) {
                secSmall = arr[i];
            }
        }

        System.out.println(firstsmall);
        System.out.println(secSmall);
    }
}
