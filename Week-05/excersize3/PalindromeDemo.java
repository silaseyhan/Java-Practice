package excersize3;

import java.util.Scanner;

public class PalindromeDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter a string: ");

        String text = input.nextLine();

        // Step 2: Create Stack and Queue
        Stack stack = new Stack(text.length());

        Queue queue = new Queue(text.length());

        // Step 3: Insert characters
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            stack.push(ch);

            queue.enqueue(ch);
        }

        // Step 4: Assume palindrome
        boolean isPalindrome = true;

        // Step 5: Compare characters
        while (!queue.isEmpty()) {

            char stackChar = stack.pop();

            char queueChar = queue.dequeue();

            if (stackChar != queueChar) {

                isPalindrome = false;

                break;
            }
        }

        // Step 6: Display result
        if (isPalindrome) {

            System.out.println("\"" + text + "\" is a palindrome.");

        } else {

            System.out.println("\"" + text + "\" is not a palindrome.");
        }

        input.close();
    }
}