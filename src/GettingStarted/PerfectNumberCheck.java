package GettingStarted;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        int num = 6;
        int perfectCheck = 0;
        for (int i = 1; i <= num - 1; i++) {       // using num - 1
            if (num % i == 0) {
                perfectCheck += i;
            }
        }

//        for (int i = 1; i <= num / 2; i++) {         // using num / 2
//            if (num % i == 0) {
//                perfectCheck += i;
//                System.out.println(i);
//            }
//        }

        if (num == perfectCheck) {
            System.out.println(num +" is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }







//        using While loop
        int num1 = 6;
        int sum = 0;
        int i = 1;
        while (i <= num1-1) {
            if (num1 % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        if (num1 == sum) {
            System.out.println(num1 +" is a perfect number");
        } else
            System.out.println(num1 +" is not a perfect number");




//        Using Recursion
        int num2 = 6;
        if (isPerfect(num2,1,0) == num2) {
            System.out.println(num1 +" is a perfect number");
        } else
            System.out.println(num1 +" is not a perfect number");
    }

    static int isPerfect(int num,int i,int sum) {
        if (i > num/2) {
            return sum;
        }
        if (num % i == 0) {
                sum = sum + i;
            }
        return isPerfect(num,++i,sum);
    }

}
