package TCS;

public class Factorial {

    static int fact(int num) {  //Using Recursion
        if (num == 1) {
            return num;
        }

        return num * fact(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(fact(4));

//        Using loop
        int num = 4;
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto = facto * i;
        }
        System.out.println(facto);
    }
}
