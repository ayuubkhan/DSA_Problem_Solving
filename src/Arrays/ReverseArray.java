package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = arr.length; i > 0 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
//        two pointer method

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int n: arr) {
            System.out.print(n+" ");
        }
        System.out.println();

//        Using recursion

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }

    static void reverseArr(int[] arr,int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArr(arr,start + 1, end - 1);
    }
}
