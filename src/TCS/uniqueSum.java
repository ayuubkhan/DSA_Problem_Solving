package TCS;

import java.util.Scanner;

public class uniqueSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int chequeLength = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            chequeLength = chequeLength + 1;

            if (arr[i] < 0) {
                System.out.println("Wrong input");
                return;
            }
        }

        if (sc.hasNext()) {
            System.out.println("Wrong input");
            return;
        }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length ; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j]++;
                    }
                }
            }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
