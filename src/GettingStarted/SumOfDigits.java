package GettingStarted;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);

//        Using Recursion
        System.out.println(SumDigits(123456,0));
        System.out.println(SumDigits(1234567));

        String num1 = "12345678";
        int sum1 = 0;
        for (int i = 0; i < num1.length(); i++) {
            sum1 += num1.charAt(i) - 48;
        }
        System.out.println(sum1);

    }
    static int SumDigits(int num, int sum) {
        if (num == 0) {
            return sum;
        }

        sum += num % 10;
        return SumDigits(num / 10, sum);
    }

//    Using Recursion 1
    static int SumDigits(int num) {
        if (num == 0) {
            return num;
        }

        return num % 10 + SumDigits(num / 10);
    }

}
