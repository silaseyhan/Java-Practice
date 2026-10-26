package Exercise1;

/**
 * BracketStack.java
 *
 * Implementation of a stack using a singly linked list for characters.
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top; // connect newNode to the current top
        top = newNode;      // update top
    }

    // TODO 2: Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char data = top.data;
        top = top.next; // The new top is the node that comes after the current top
        return data;
    }

    // TODO 3: Return the top element without removing it
    public char peek() {
        if (isEmpty()) {
            return '\0'; // Return null/default char if stack is empty
        }
        return top.data; // Return the data of the top
    }

    // TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}