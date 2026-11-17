package excersize3;

public class Queue {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {

        items = new char[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue
    public void enqueue(char value) {

        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }

        rear = (rear + 1) % items.length;

        items[rear] = value;

        count++;
    }

    // Dequeue
    public char dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        char removedValue = items[front];

        front = (front + 1) % items.length;

        count--;

        return removedValue;
    }

    // Peek
    public char peek() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        return items[front];
    }

    // Is Empty
    public boolean isEmpty() {

        return count == 0;
    }

    // Is Full
    public boolean isFull() {

        return count == items.length;
    }

    // Size
    public int size() {

        return count;
    }
}