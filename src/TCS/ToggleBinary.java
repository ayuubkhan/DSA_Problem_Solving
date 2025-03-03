package TCS;

public class ToggleBinary {
    public static void main(String[] args) {
        int num = 9;
        String binary = "1010";

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        System.out.println(binary);

    }
}
