package concept.heap;

public class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

// Build MAX HEAP
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int maxIdx = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l > n && r > n)
            return;

        if (l < n && arr[maxIdx] < arr[l])
            maxIdx = l;

        if (r < n && arr[maxIdx] < arr[r])
            maxIdx = r;

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, n, maxIdx);
        }


    }


    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: ");
        for (int i: array)
        System.out.print(i+" ");

        // Perform heap sort
        heapSort(array);

        System.out.println("\nSorted array in ascending order: ");
        for (int i: array)
            System.out.print(i+" ");
    }
}
