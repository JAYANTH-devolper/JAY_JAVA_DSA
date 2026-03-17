public class REVERSENUMBER {

    public void reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;   // Get last digit
            reversedNumber = reversedNumber * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }

        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static void main(String[] args) {
        int number = 12345;

        REVERSENUMBER reverse = new REVERSENUMBER();
        reverse.reverseNumber(number);
    }
}