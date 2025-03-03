package GettingStarted;

public class EvenOddCheck {
    public static void main(String[] args) {
        int num = 1;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

//        Using Ternary Operator
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
