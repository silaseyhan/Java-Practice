package Exercise2;

/**

 * EquationReverser.java

 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?

        // (Answer: It is static so it can be called directly using the class name without instantiating EquationReverser.)

        // create the object of the TokenStack class

        TokenStack stack = new TokenStack();

        int i = 0;

        // TODO 1 & 2 & 3: Traverse the equation, extract numbers and operators, and push onto the stack.

        while (i < equation.length()) {

            char current = equation.charAt(i);

            // Check whether the current character is a digit

            if (Character.isDigit(current)) {

                int start = i; // Remember where the number starts

                // Move forward while the characters are digits

                while (i < equation.length() && Character.isDigit(equation.charAt(i))) {

                    i++;

                }

                // Extract the entire number and push it

                String number = equation.substring(start, i);

                stack.push(number);

            } else {

                // Otherwise, push the operator

                stack.push(String.valueOf(current));

                i++;

            }

        }

        // TODO 4: Pop all items from the stack and append them to a StringBuilder.

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {

            result.append(stack.pop());

        }

        return result.toString();

    }

}
 