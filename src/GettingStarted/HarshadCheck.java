package GettingStarted;

import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int copyOfn = n;
        int result = 0;

        while (n != 0) {
            int last_pick = n%10;
            result = result + last_pick;
            n /= 10;
        }

        if (copyOfn % result == 0) {
            System.out.println("It is an Harshad number");
        }else {
            System.out.println("It is not an Harshad number");
        }
    }
}
