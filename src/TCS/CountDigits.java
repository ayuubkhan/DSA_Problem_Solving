package TCS;

public class CountDigits {
    public static void main(String[] args) {
        // Counting digits in a positive/negative number
        int number = -245;
        int digitCount = 0;

        int tempNumber = Math.abs(number); // Convert to positive for accurate digit count
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }
        System.out.println("Digit count of " + number + ": " + digitCount);

        // Counting digits in a number from a string
        String numberString = "12345";
        int convertedNumber = Integer.parseInt(numberString);
        int stringDigitCount = 0;

        while (convertedNumber != 0) {
            convertedNumber = convertedNumber / 10;
            stringDigitCount++;
        }
        System.out.println("Digit count of " + numberString + ": " + stringDigitCount);

    }
}
