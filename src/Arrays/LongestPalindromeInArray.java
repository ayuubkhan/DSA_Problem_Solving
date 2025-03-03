package Arrays;

import java.util.Arrays;

public class LongestPalindromeInArray {
    public static void main(String[] args) {
        int palindrome [] = {121, 2322, 54545, 999990};
        /*
        int longestPalindrome = 0;
        for (int i = 0; i < palindrome.length; i++) {
            int eachPalindrome = palindrome[i];
            String numberString = Integer.toString(eachPalindrome);

            int start = 0;
            int end = numberString.length() - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (numberString.charAt(start) != numberString.charAt(end)) {
                    isPalindrome = false;
                    break;
                } else {
                    start++;
                    end--;
                }
            }

            if (isPalindrome && eachPalindrome > longestPalindrome) {
                longestPalindrome = eachPalindrome;
            }
        }

        System.out.println(longestPalindrome);
        */

//        Using inbuilt sorting method
        Arrays.sort(palindrome);
        for (int i = palindrome.length - 1; i >= 0; i--) {
            if (isPalindrome(palindrome[i])) {
                System.out.println(palindrome[i]);
                return;
            }
        }

    }

    static boolean isPalindrome(int arr) {
        int temp = arr;
        int reverse = 0;
        while (temp > 0) {
            int extract = temp % 10;
            reverse = (reverse*10) + extract;
            temp = temp / 10;
        }

        if (arr == reverse) {
            return true;
        }
        return false;
    }
}
