package GettingStarted;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000 ; i++) {
            int input = i;
            String num = Integer.toString(input);
            int total = 0;

            for (int j = 0; j < num.length(); j++) {
                int digit = num.charAt(j) - '0';
                total += Math.pow(digit,num.length());
            }

            if (input == total) {
                System.out.print(input+" ");
            }
        }
        System.out.println("is an Armstrong number");

//        Using Recursive and user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower and upper ranges : ");
        int low = sc.nextInt();
        int upper = sc.nextInt();
        System.out.print("Armstrong numbers between "+ low +" and " + upper + " are : ");

        for (int i = low; i <= upper; i++) {
            int len = getOrder(i);

            if (i == getArmstrong(i,len)) {
                System.out.print(i+" ");
            }
        }
    }

    static int getArmstrong(int i, int len) {
        if (i == 0) {
            return 0;
        }

        int digit = i % 10;

        return (int) Math.pow(digit,len) + getArmstrong(i/10,len);
    }

    static int getOrder(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }
}
