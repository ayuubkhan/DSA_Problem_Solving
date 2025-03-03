package GettingStarted;

public class FactorsOfNumber {
    public static void main(String[] args) {

        int num = 126;
        for (int i = 1; i <= num ; i++) {
            if (num % i == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        int num1 = 127;
        for (int i = 1; i <= num1/2 ; i++) {
            if (num1 % i == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println(num1);

        int num2 = 128;
        for (int i = 1; i <= Math.sqrt(num2) ; i++) {
            if (num2 % i == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
