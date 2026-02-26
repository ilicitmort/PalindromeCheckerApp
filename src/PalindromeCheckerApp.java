/*
 * UC11: Object-Oriented Palindrome Service
 * Palindrome Checker App
 * Version: 2.0
 */

import java.util.Scanner;

// Service class that encapsulates palindrome logic
class PalindromeChecker {

    // Public method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    // Main Method - Entry point
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("           Palindrome Checker App             ");
        System.out.println("===============================================");
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.println("===============================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("===============================================");

        scanner.close();
    }
}