/*
 * UC5: Stack-Based Palindrome Checker
 * Palindrome Checker App
 * Version: 1.4
 */

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Main Method - Entry point
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App        ");
        System.out.println("=======================================");
        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("=======================================");

        scanner.close();
    }
}