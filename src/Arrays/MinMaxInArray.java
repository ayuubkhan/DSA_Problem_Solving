package Arrays;

public class MinMaxInArray {
    public static void main(String[] args) {
        int arr[] = {3, 6, 8, 7, 9, 3, 1};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);

        System.out.println(getMin(arr, arr.length));
        System.out.println(getMax(arr, arr.length));
    }
//    using recursion

    static int getMin(int [] arr, int i) {
        if (i == 1) {
            return arr[0];
        }

        int smallest = getMin(arr,i-1);

        return  arr[i - 1] < smallest ? arr[i - 1] : smallest;
    }

    static int getMax(int[] arr, int i) {
        if (i == 1) {
            return arr[0];
        }

        int max = getMax(arr,i-1);

        return arr[i - 1] > max ? arr[i - 1] : max;
    }
}
