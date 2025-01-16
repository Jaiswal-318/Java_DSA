package concept.queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSubarrays {

    public static int[] maxOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements outside the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove smaller elements from the end of deque
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            // Add maximum of current window to result if window is of size k
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        int[] output = maxOfSubarrays(arr, k);

        // Print the output
        for (int num : output) {
            System.out.print(num + " ");
        }
        // Output: 3 3 4 5 5 5 6
    }
}
