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
        System.out.println("UC4: Character Based Palindrome Check");
        System.out.println("=======================================");

        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        char[] characters = input.toCharArray();


        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        // Compare original and reversed using equals()
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("=======================================");

        // Close scanner
        scanner.close();
    }
}