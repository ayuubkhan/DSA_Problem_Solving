package TCS;

import java.util.Scanner;

public class CountDivisibleDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int original = n;
        int count = 0;

        while (original != 0) {
            int temp = original % 10;

            if (temp != 0 && n % temp == 0) {
                count++;
            }

            original /= 10;
        }

        System.out.println(count);
    }
}
