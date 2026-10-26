package Exercise1;

/**
 * BalancedBrackets.java
 *
 * Utility class to check if brackets in an expression are balanced.
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        // Create a stack
        BracketStack stack = new BracketStack();

        // 1. Traverse the string character by character.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 2. If the character is an opening bracket, push it onto the stack.
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // 3. If it is a closing bracket:
            else if (c == ')' || c == '}' || c == ']') {
                // - Check whether the stack is empty.
                if (stack.isEmpty()) {
                    return false;
                }
                // - Pop the top opening bracket.
                char topOpening = stack.pop();
                // - Check whether the brackets match (call isMatchingPair method).
                if (!isMatchingPair(topOpening, c)) {
                    return false;
                }
            }
        }

        // 4. At the end, check whether the stack is empty.
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        // Check: ( matches )
        if (opening == '(' && closing == ')') return true;
        // Check: [ matches ]
        if (opening == '[' && closing == ']') return true;
        // Check: { matches }
        if (opening == '{' && closing == '}') return true;

        // if check doesn't match, then return false
        return false;
    }
}