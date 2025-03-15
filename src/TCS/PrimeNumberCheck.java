package TCS;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n < 2)  {
            System.out.println("It is not a Prime number");
            return;
        }

//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("It is a Prime number");
        } else {
            System.out.println("It is not a Prime number");
        }
    }
}
