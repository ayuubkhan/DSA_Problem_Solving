package GettingStarted;

public class GreatestOfThree {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        //checking if num1 is greatest
        if (num1 >= num2 && num1 >= num3)
            System.out.println (num1 + " is the greatest");

            //checking if num2 is greatest
        else if (num2 >= num1 && num2 >= num3)
            System.out.println (num2 + " is the greatest");

            //checking if num3 is greatest
        else
            System.out.println(num3 + " is the greatest");

//        Using Ternary Opeartor

        int temp = num1 > num2 ? num1 : num2;
        int result = temp > num3 ? temp : num3;
        System.out.println(result);
    }
}
