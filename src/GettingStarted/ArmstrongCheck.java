package GettingStarted;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 381;
        String nums = Integer.toString(num);

        int Total = 0;

        for (int i = 0; i < nums.length(); i++) {
            int digit = nums.charAt(i) - '0';
            Total += Math.pow(digit,nums.length());
        }

        if (num == Total) {
            System.out.println("It is an ArmStrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

//        Using Recursion
//
        int num1 =  1634;
        int len = order(num1);

        if (num1 == getArmstrongSum(num1,len)) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not an Armstrong number");
        }

    }

    static int getArmstrongSum(int num1, int len) {
        if (num1 == 0) {
            return 0;
        }

        int digit = num1 % 10;
        return (int) Math.pow(digit,len) + getArmstrongSum(num1 / 10,len);
    }

    static int order(int num1) {
        int len = 0;

        while (num1 != 0) {
            len++;
            num1 /= 10;
        }

        return len;
    }


}
