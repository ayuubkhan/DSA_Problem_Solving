package GettingStarted;

public class AutomorphicCheck {
    public static void main(String[] args) {
//        First Approach
        int x = 5;
        int y = x*x;

        if (x%10 == y%10) {
            System.out.println("It is an Automorphic number");
        } else {
            System.out.println("It is not an Automorphic number");
        }

//        Second Approach
        int n = 376;
        if (isAutomorphic(376,n*n)) {
            System.out.println("It is an Automorphic number");
        } else {
            System.out.println("It is not an Automorphic number");
        }

    }

    static boolean isAutomorphic(int n,int square) {

        while (n != 0) {
            if (n%10 != square%10) {
                return false;
            }

            n /= 10;
            square /= 10;
        }
        return true;
    }


}
