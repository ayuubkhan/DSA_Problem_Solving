package GettingStarted;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 2; i <= 5 ; i++) {
            fact = fact * i;
        }
        System.out.println(fact);

        System.out.println(fact(5));
    }

    static int fact(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fact(num - 1);
    }
}
