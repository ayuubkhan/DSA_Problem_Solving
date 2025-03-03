package GettingStarted;

import jdk.jshell.execution.JdiDefaultExecutionControl;

public class StrongNumberCheck {
    public static void main(String[] args) {
        int num = 145;
        String num1 = Integer.toString(num);
        int finalS = 0;

        for (int i = 0; i < num1.length(); i++) {
            int a = num1.charAt(i) - '0';   // Converting character to int

            int fact = 1;
            for (int j = a; j > 0; j--) {
                fact = fact * j;
            }

            finalS = finalS + fact;
        }

        if (num == finalS) {
            System.out.println(num+" is a Strong number");
        } else {
            System.out.println(num+" is not a strong number");
        }

//        Using recursive
        int number = 134;
        if (detectStrongNum(number)) {
            System.out.println(number +" is a Strong number");
        } else {
            System.out.println(number+" is not a Strong number");
        }

    }

    static boolean detectStrongNum(int num) {
        int temp = num;
        int sum = 0;
        int digit = 0;

        while (temp != 0) {
            digit = temp%10;
            sum = sum + facto(digit);
            temp /= 10;
        }
        return sum == num;
    }

    static int facto(int digit) {
        if (digit == 0) {
            return 1;
        }

        return digit * facto(digit - 1);
    }
}
