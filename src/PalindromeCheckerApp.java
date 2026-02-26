/*
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * Palindrome Checker App
 * Version: 1.9
 */

import java.util.Scanner;

public class
PalindromeCheckerApp {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove all non-alphanumeric characters (including spaces)
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("           Palindrome Checker App             ");
        System.out.println("===============================================");
        System.out.println("UC10: Case-Insensitive & Space-Ignored Check");
        System.out.println("===============================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("The given input is a Palindrome.");
        } else {
            System.out.println("The given input is NOT a Palindrome.");
        }

        System.out.println("===============================================");

        scanner.close();
    }
}