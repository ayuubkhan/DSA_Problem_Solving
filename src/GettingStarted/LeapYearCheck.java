package GettingStarted;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = 2028;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            System.out.println(+year +" is a Leap year");
        } else {
            System.out.println(+year +" is not a Leap year");
        }

//        Using Ternary Operator
        int temp = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 1 : 0;

        if (temp == 1) {
            System.out.println(+year+" is a Leap year");
        } else {
            System.out.println(+year+" is not a Leap year");
        }
    }
}
