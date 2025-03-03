package GettingStarted;

public class PrimeInRange {
    public static void main(String[] args) {
        int lower = 12;
        int upper = 20;

        for (int i = lower; i < upper; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int i) {
        if(i < 2) {
            return false;
        }

        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
