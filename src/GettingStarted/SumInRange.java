package GettingStarted;

public class SumInRange {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }
        System.out.println(sum);

//        Using Formula n*(n+1)/2
        System.out.println(b*(b+1)/2 - a*(a+1)/2 + a);

//        Using Recursion
        int finalSum = getSumRange(12,15,0);
        System.out.println(finalSum);
    }
    static int getSumRange(int a, int b, int sum) {
        if (b < a){
            return sum;
        }

        return b + getSumRange(a,(b-1),sum);
    }
}
