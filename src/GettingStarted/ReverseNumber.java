package GettingStarted;

public class ReverseNumber {
    public static void main(String[] args) {
//        Using While loop
        int input = 1234;
        int output = 0 ;
        int rem;
        while (input != 0) {
            rem = input % 10;
            output = output * 10 + rem;   // Important formula for revering a number
            input = input / 10;
        }
        System.out.println(output);

//        Using For Loop

        int num = 12345;
        int rev = 0;
        int rem1;

        for (; num != 0; num = num / 10) {
            rem1 = num % 10;
            rev = rev * 10 + rem1;
        }

        System.out.println(rev);

//        Using Recursion
        int nums = 123456, reverse = 0;
        System.out.println(getReverse(nums,reverse));

//        Using Recursion 1
        int number = 1234567;
        getReverse1(number);

    }

    static int getReverse(int num,int rev) {
        if (num == 0) {
            return rev;
        }

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num / 10,rev);
    }

    static void getReverse1(int num) {
        if (num == 0) {
            return;
        }

        int rem = num % 10;
        System.out.print(rem);

        getReverse1(num / 10);
    }
}
