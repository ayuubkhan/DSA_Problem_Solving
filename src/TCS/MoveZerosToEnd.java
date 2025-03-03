package TCS;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {6,0,1,8,0,2};

        int[] arr1 = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[count++] = arr[i];
            }
        }

        for (int i = count; i < arr1.length ; i++) {
            arr1[i] = 0;
        }

        for (int num: arr1) {
            System.out.println(num);
        }
    }
}
