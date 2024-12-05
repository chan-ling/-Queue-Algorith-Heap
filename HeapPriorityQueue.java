import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapPriorityQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Min-heap by default

        System.out.println("Heap Priority Queue Application");
        System.out.println("Enter numbers (non-numeric input quits):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            minHeap.offer(num);
            System.out.println("Current Heap: " + minHeap);
        }

        System.out.println("\nFinal Heap contents:");
        System.out.println(minHeap);

        System.out.println("\nRemoving elements (smallest first):");
        while (!minHeap.isEmpty()) {
            System.out.println("Removed: " + minHeap.poll());
        }

        scanner.close();
    }
}
