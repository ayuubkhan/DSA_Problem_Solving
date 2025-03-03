package GettingStarted;

import java.util.Scanner;

public class AbundantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Abundant number");
        int num = sc.nextInt();
        int result = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                result += i;
            }
        }

        System.out.println(result);
        if (result > num) {
            System.out.println("It is an Abundant number");
        }else {
            System.out.println("Not an Abundant number");
        }
        System.out.println("The Abundance is "+(result - num));

//        Using Math.sqrt
//        When finding divisors, for every divisor i, there is a corresponding divisor n / i.
//                For example, if n = 36:
//
//        Divisors come in pairs:
//        1 × 36, 2 × 18, 3 × 12, 4 × 9, 6 × 6
//        The last pair (6 × 6) has duplicate values (i == n / i), so we should add only one 6, not twice.

        System.out.println("Enter Abundant number");
        int n = sc.nextInt();
        if (getSum(n) > n ) {
            System.out.println("It is an Abundant number");
        }else {
            System.out.println("Not an Abundant number");
        }
        System.out.println("The Abundance is "+(result - num));
    }

    static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (i == n/i) {
                    sum += i;
                } else {
                    sum += i + (n/i);
                }
            }
        }
        return sum;
    }
}
