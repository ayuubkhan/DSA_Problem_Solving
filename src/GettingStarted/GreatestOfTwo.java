package GettingStarted;

public class GreatestOfTwo {
    public static void main(String[] args) {
        int num1 = 50, num2 = 20;
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is greater");

        else
            System.out.println (num2 + " is greater");

//        Using Ternary Operator
        System.out.println(num1 > num2 ? num1+" is greater" : num2+" is greater");

//       Using in-built Max FUnction
        System.out.println(Math.max(num1,num2));
    }
}
