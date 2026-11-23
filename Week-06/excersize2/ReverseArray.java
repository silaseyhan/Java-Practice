package excersize2;

public class ReverseArray {
    public static void reverseArray(int[] arr, int left, int right) {
        // STEP 1: Base case
        if (left >= right) {
            return;
        }
        // STEP 2: Store left value
        int temp = arr[left];
        // STEP 3: Move right value to left
        arr[left] = arr[right];
        // STEP 4: Move temporary value to right
        arr[right] = temp;
        // STEP 5: Recursive call
        reverseArray(arr, left + 1, right - 1);
    }
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create numbers array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array:");
        displayArray(numbers);
        // Call recursive method
        reverseArray(numbers, 0, numbers.length - 1);
        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}
