/*
 * UC2: Print a Hardcoded Palindrome Result
 * Palindrome Checker App
 * Version: 1.0
 */

public class PalindromeCheckerApp {

    // Main Method - Entry point of the application
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App        ");
        System.out.println("=======================================");
        System.out.println("UC2: Print a Hardcoded Palindrome Result");
        System.out.println("=======================================");

        // Hardcoded string
        String word = "madam";

        // Check if the string is a palindrome
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional check
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("=======================================");
    }
}