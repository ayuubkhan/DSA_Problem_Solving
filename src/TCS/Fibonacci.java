package TCS;

import java.util.Scanner;

public class Fibonacci {    //using Recursion
    static  int d = 0,e = 1;
    static void fibo(int n) {
        if (n > 0) {
            int f = d + e;
            System.out.println(f+" ");
            d = e;
            e = f;
            fibo(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(d +" "+e+" ");
        fibo(5 - 2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to print fibonacci number?");
        int num = sc.nextInt();
         int a = 0;
         int b = 1;

        System.out.print(a+" "+b+" ");
        for (int i = 2; i < num; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }


    }
}
