package GettingStarted;

public class PalindromeCheck {
    public static void main(String[] args) {
//        Using Two pointer Approach
        String input = "12678187621";
        int start = 0;
        int end = input.length()-1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start ++;
            end --;
        }

        if (isPalindrome)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not palindrome");

//        Using For loop

        int input1 = 121;
        int temp = input1;
        int reverse = 0;
        while (temp != 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        if (input1 == reverse)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");

//        Using Recursion
        int nums = 12347421;
        if (getReverse(nums,0) == nums) {
            System.out.println("it is palindrome");
        } else
            System.out.println("It is not a palindrome");

//        Using String Builder
        System.out.println(isPalindrome("radar".toLowerCase()));
        System.out.println(isPalindrome("Naman".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("12345".toLowerCase()));
    }

    static int getReverse(int num, int rev) {
        if (num == 0) {
            return  rev;
        }

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num/10,rev);
    }

//    Stringbuilder function
    static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}
