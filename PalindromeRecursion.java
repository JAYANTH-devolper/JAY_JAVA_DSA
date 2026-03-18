public class PalindromeRecursion {
    public static boolean isPalindrome(String str) {
        // Base case: if the string is empty or has only one character, it's a palindrome
        if (str.length() <= 1) {
            return true;
        }
        
        // Recursive case: check if the first and last characters are the same
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If they are the same, check the substring that excludes these characters
            return isPalindrome(str.substring(1, str.length() - 1));
        }
        
        // If the first and last characters are not the same, it's not a palindrome
        return false;
    }

    public static void main(String[] args) {
        String testString = "racecar";
        System.out.println(testString + " is a palindrome: " + isPalindrome(testString));
        
        testString = "hello";
        System.out.println(testString + " is a palindrome: " + isPalindrome(testString));
    }
}