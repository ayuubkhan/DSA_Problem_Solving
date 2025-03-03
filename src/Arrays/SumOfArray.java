package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

//        Using Recursion
        System.out.println(sumOfArr(arr,0,arr.length));
        System.out.println(sumOfArr(arr,arr.length - 1));
    }

    static int sumOfArr(int[] arr,int index, int len) {
        if (index == len - 1) {
            return arr[index];
        }

        return arr[index] + sumOfArr(arr, index + 1,len);
    }

    static int sumOfArr(int[] arr,int index) {
        if (index == 0) {
            return arr[index];
        }

        return arr[index] + sumOfArr(arr, index - 1);
    }

}
