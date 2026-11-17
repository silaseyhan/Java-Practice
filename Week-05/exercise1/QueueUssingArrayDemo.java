package exercise1;

public class QueueUssingArrayDemo {

    public static void main(String[] args) {

        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        // Create Queue
        Queue<String> queue = new Queue<>(10);

        // Insert first 10 students
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        // Original Queue
        System.out.println("Original Queue: " + queue);

        // Queue Size
        System.out.println("Queue Size: " + queue.size());

        // Peek
        System.out.println("First Student: " + queue.peek());

        // Remove three students
        System.out.println();
        System.out.println("Removing three students:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }

        // Remaining Queue
        System.out.println();
        System.out.println("Queue After Removal: " + queue);

        // Final Size
        System.out.println("Final Queue Size: " + queue.size());

        // Add 11th student
        // queue.enqueue(students[10]);
    }
}