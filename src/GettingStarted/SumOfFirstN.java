package GettingStarted;

public class SumOfFirstN {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.print(sum +" ");
        }
        System.out.println();

//        Using Formula
        int n = 6;
        System.out.println(n*(n+1)/2);

//        Using Recursion
        int finResult = getSum(6);
        System.out.println(finResult);
    }
    static int getSum(int n) {
        if(n == 0) {
            return n;
        }

        return n + getSum(n - 1);
    }
}
