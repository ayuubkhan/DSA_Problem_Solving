package GettingStarted;

public class FriendlyPairCheck {
    public static void main(String[] args) {
        int num1 = 30, num2 = 40;
        int sum1 = getfactorsSum(num1), sum2 = getfactorsSum(num2);

        if (sum1 / num1 == sum2 / num2) {
            System.out.println("It's a friendly pair");
        } else {
            System.out.println("It's not a friendly pair");
        }
    }

    static int getfactorsSum(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
