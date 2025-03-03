package Linear_Binary_Search;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {18,12,9,14,77,50};
//        System.out.println(linearSearch(arr,9));

//        String name = "Nazreen";
//        System.out.println(search(name, 'b'));

//        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(searchInRange(arr1,778 ,4,6));

//        int[] min = {10,7,6,8,3,1,4,0,-100,9};
//        System.out.println(minNum(min));

//        int[][] arr2d = {
//                {23, 4, 1},
//                {18, 12, 3, 9},
//                {78, 99, 34, 56},
//                {18, 12}
//        };
//        System.out.println(Arrays.toString(searchIn2dArr(arr2d, 0)));

//        int[][] maxArr2d = {
//                {23, 4, 1},
//                {18, 12, 3, 9},
//                {78, 99, 34, 56},
//                {18, 12}
//        };
//        System.out.println(maxIn2dArr(maxArr2d));

        int [] numsWithEvenNumOfDigits = {12,345,2,6,7896};
        System.out.println(findNumbers(numsWithEvenNumOfDigits));

        int a = (int)(7.9);
    }

    static int  linearSearch(int[] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }

//        FOR LOOP
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }

//      FOR ENHANCED LOOP
        for(int i : arr) {
            if (i == target) {
                return i;
            }
        }

        return -1;
    }

    static boolean search(String str, int target){
        if (str.length() == 0) {
            return false;
        }

//        FOR LOOP
//        for (int i = 0; i < str.length(); i++) {
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }

//        FOR ENHANCED LOOP
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return false;
            }
        }

        return false;
    }

    static boolean searchInRange(int[] arr1, int target, int start, int end) {
        if (arr1.length == 0){
            return false;
        }

        for (int i = start; i <= end; i ++) {
            if (arr1[i] == target) {
                return true;
            }
        }
        return false;
    }

    static int minNum(int[] min) {
        int minimum = min[0];
        if (min.length == 0) {
            return -1;
        }

        for (int i = 0; i < min.length; i++) {
            if (minimum >= min[i]) {
                minimum = min[i];
            }
        }
        return minimum;
    }

    static int[] searchIn2dArr(int[][] arr2d, int target) {
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (arr2d[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxIn2dArr(int[][] maxArr2d){
        int max = maxArr2d[0][0];

        for (int i = 0; i < maxArr2d.length; i++) {
            for (int j = 0; j < maxArr2d[i].length; j++) {
                if (maxArr2d[i][j] > max) {
                    max = maxArr2d[i][j];
                }
            }
        }
        return max;
    }

    static int findNumbers(int[]num){
        int count = 0;

        for (int i = 0; i < num.length ; i++) {
            if (even(num[i])){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigits = digits(num);
        if (numOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num){
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
