package concept.greedyAlgorithm;
import java.util.Arrays;

public class LexiSmallestString {
    public static void main(String[] args) {
        int n = 3;
        int k = 25;
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');

        // Initial sum is n since each 'a' contributes 1
        k -= n;

        for (int i = arr.length - 1; i >= 0 && k > 0; i--) {
            int increment = Math.min(25, k);
            arr[i] += (char) increment;
            k -= increment;
        }

        System.out.println(new String(arr));
    }
}
