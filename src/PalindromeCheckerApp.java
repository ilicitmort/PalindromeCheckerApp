/*
 * UC13: Performance Comparison of Palindrome Algorithms
 * Palindrome Checker App
 * Version: 2.2
 */

import java.util.*;

public class PalindromeCheckerApp {

    // 1️⃣ Two-Pointer Approach
    public static boolean twoPointerCheck(String input) {
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

    // 2️⃣ Stack-Based Approach
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque-Based Approach
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("        Palindrome Checker App - UC13          ");
        System.out.println("        Performance Comparison                 ");
        System.out.println("=================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two-Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        System.out.println("=================================================");

        scanner.close();
    }
}