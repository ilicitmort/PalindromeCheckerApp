/*
 * UC6: Queue + Stack Based Palindrome Check
 * Palindrome Checker App
 * Version: 1.5
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Main Method - Entry point
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("        Palindrome Checker App        ");
        System.out.println("=======================================");
        System.out.println("UC6: Queue + Stack Based Palindrome Check");
        System.out.println("=======================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("The word \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("=======================================");

        scanner.close();
    }
}