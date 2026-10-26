package Exercise2;

/**
 * TokenStack.java
 *
 * Implementation of a stack using a singly linked list for String tokens.
 */

public class TokenStack {

    private class Node {
        // create the instance named data as a String type
        String data;

        // create the next pointer that will be used for the Stack implementation as a Node type
        Node next;

        // complete the constructor accordingly
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // create the top pointer that will be used for the Stack implementation as private
    private Node top;

    public TokenStack() {
        // create the constructor of the TokenStack class that will assign the top pointer to null
        top = null;
    }

    public void push(String value) {
        // TODO: Create a new node.
        //       Connect it to the current top.
        //       Update top.
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        // TODO: Check whether the stack is empty.
        //       Store the top value.
        //       Move top to the next node.
        //       Return the stored value.
        if (isEmpty()) {
            return null;
        }
        String data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        // TODO: Return whether the stack is empty.
        return top == null;
    }
}