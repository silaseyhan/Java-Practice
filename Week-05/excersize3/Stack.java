package excersize3;

public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {

        items = new char[capacity];
        top = -1;
    }

    // Push
    public void push(char value) {

        if (isFull()) {
            throw new RuntimeException("Stack is full!");
        }

        top++;

        items[top] = value;
    }

    // Pop
    public char pop() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        char removedValue = items[top];

        top--;

        return removedValue;
    }

    // Peek
    public char peek() {

        if (isEmpty()) {
            throw new RuntimeException("Stack is empty!");
        }

        return items[top];
    }

    // Is Empty
    public boolean isEmpty() {

        return top == -1;
    }

    // Is Full
    public boolean isFull() {

        return top == items.length - 1;
    }
}