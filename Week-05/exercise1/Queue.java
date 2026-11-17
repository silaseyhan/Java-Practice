package exercise1;

public class Queue<T> {

    private T[] items;
    private int front;
    private int rear;
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {

        items = (T[]) new Object[capacity];

        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue
    public void enqueue(T value) {

        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }

        rear = rear + 1;

        items[rear] = value;

        count++;
    }

    // Dequeue
    public T dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        T removedValue = items[front];

        items[front] = null;

        front++;

        count--;

        return removedValue;
    }

    // Peek
    public T peek() {

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

    // To String
    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < count; i++) {

            int index = front + i;

            result.append(items[index]);

            if (i < count - 1) {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }
}

