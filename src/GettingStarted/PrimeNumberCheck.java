package GettingStarted;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int prime = 5;
        boolean isPrime = true;
        for (int i = 2; i <= prime - 1; i++) {
//        for (int i = 2; i <= prime / 2; i++) {
//        for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    isPrime = false;
                    break;
                }
        }

        if (isPrime && prime > 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }


//        Using Recursion
        boolean Result = primeNum(5,2);
        if (Result){
            System.out.println("It is a Prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

    static boolean primeNum(int n, int i) {
        if (n < 2){
            return false;
        }

        if(i == n){
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return primeNum(n,i+1);
    }
}
