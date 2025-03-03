package GettingStarted;

public class PowerOfNumber {
    public static void main(String[] args) {
        int num = 2;
        int power = 3;
        int ans = 1;

        while (power != 0) {
             ans *= num;
            power --;
        }

        System.out.println(ans);


//      Using Recursion
        System.out.println(power(3,3));
    }

    static int power(int num, int power) {
        if (power == 0) {
            return 1;
        }

        return num * power(num,power-1);
    }
}
