package TCS;

public class PalindromeCheck {
    public static void main(String[] args) {
//        Using Integer
        int num = 1231;
        int temp = num;
        int reverse = 0;

        while (temp != 0) {
            int oneNum = temp % 10;
            reverse = reverse * 10 + oneNum;
            temp /= 10;
        }

        if (num == reverse) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }

//        Using String
        String alphabet = "12384321";
        int start = 0;
        boolean isPalindrome = true;
        int end = alphabet.length() - 1;

        while (start < end){
            if (alphabet.charAt(start) != alphabet.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
