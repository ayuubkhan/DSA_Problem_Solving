package TCS;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = sc.nextInt();
        System.out.println("Enter 2nd num ");
        int b = sc.nextInt();

        while (b != 0) {
            int temp = b;
            b = a%b;
            a = temp;
        }

        System.out.println("GCD : "+a);
    }
}
