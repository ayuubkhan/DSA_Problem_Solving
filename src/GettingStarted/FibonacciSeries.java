package GettingStarted;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(+a +" "+b+" ");


        for (int i = 2; i < 10 ; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println();

//        Using Recursion
        System.out.print(d +" "+e+" ");
        int n = 10;
        fibo(n-2);
    }

    static  int d = 0, e = 1;

    static void fibo(int n) {
        if (n > 0) {
            int f = d + e;
            System.out.print(f+" ");
            d = e;
            e = f;
            fibo(n - 1);
        }
    }

}
