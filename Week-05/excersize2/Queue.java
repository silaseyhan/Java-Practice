package excersize2;
public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {

       front=null;
       rear=null;
       size=0;

        // Step 2: Initialize size as 0.
    }

    public void enqueue(String customerName) {
        Node newNode = new Node(customerName);


        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }


    public String dequeue() {

        if (isEmpty()) {
            return null;
        }

        String removedCustomer=front.customerName;

        front=front.next;

        if (front==null) {
            rear=null;
        }
        return null;
    }

    public boolean isEmpty() {

       return front==null;


    }

    public int size() {

        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;

        while (current != null) {

            System.out.print(current.customerName);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}