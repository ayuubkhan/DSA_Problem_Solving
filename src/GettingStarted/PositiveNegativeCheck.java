package GettingStarted;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        int num = 0;
        if (num == 0) {
            System.out.println("Zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

//        Using Ternary Operator
        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(num > 0? "Positive" : "Negative");
        }
    }
}
