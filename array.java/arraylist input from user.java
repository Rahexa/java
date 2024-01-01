package array;
import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // Rename the ArrayList to avoid naming conflicts

        System.out.print("Enter the number of elements: ");
        int count = sc.nextInt();

        System.out.println("Enter " + count + " elements:");

        for (int i = 0; i < count; i++) {
            int element = sc.nextInt();
            numbers.add(element);
        }

        // Display the elements
        System.out.println("Elements: ");
        for (int x : numbers) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Size = " + numbers.size());

        // Adding element
        System.out.println("After adding a new element at index 6");
        numbers.add(6, 70);
        System.out.println(numbers);

        // Removing element
        System.out.println("After removing an element at index 2");
        numbers.remove(2);
        System.out.println(numbers);

        // Replacing element
        System.out.println("After replacing an element at index 1");
        numbers.set(1, 90);
        System.out.println(numbers);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}

