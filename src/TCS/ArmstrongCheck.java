package TCS;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int num = 153;
        int count = 0;
        int finalSum = 0;

        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int temp1 = num;
        while (temp1 != 0) {
            int digit = temp1 % 10;

            int power = 1;
            for (int i = 0; i < count; i++) {
//                power *= digit;
                power *= digit;
            }

            System.out.println(power);
            finalSum += power;
            temp1 /= 10;
        }

        if (num == finalSum) {
            System.out.println("It is an Armstrong number");
        } else {
            System.out.println("It is not a Armstrong number");
        }
    }
}
