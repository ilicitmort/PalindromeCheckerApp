/*
 * UC3: Palindrome Check Using String Reverse
 * Palindrome Checker App
 * Version: 1.0
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    // Main Method - Entry point of the application
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App        ");
        System.out.println("=======================================");
        System.out.println("UC3: Palindrome Check Using String Reverse");
        System.out.println("=======================================");

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = scanner.nextLine();

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The word \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("=======================================");

        // Close scanner
        scanner.close();
    }
}