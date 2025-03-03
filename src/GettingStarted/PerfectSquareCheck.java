package GettingStarted;

public class PerfectSquareCheck {
    public static void main(String[] args) {
//        Using Function
        int x = 48;
        if (isPerfectSquare(x)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not Perfect Square");
        }

//        Using floor and ceilfunction
        int n = 67;
        ceilFloorFunc(n);


    }

    static void ceilFloorFunc(int n) {
        if (Math.ceil(Math.sqrt(n)) == (Math.floor(Math.sqrt(n)))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    static boolean isPerfectSquare(int num) {
        if (num >= 0) {
            int sqrt = (int) Math.sqrt(num);
            return ((sqrt * sqrt) == num);
        }
        return false;
    }
}
