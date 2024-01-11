package BasicSortingAlgos;

import java.util.Arrays;

/**
 * SelectionSort
 */
public class SelectionSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void DoSelectionSortIteratively(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            }
            swap(arr, i, minIdx);
        }
    }

    static void DoSelectionSortRecursively(int[] arr) {
        SelectionSortHelper(arr, 0, 1, 0);
    }

    static void SelectionSortHelper(int[] arr, int i, int j, int minIdx) {
        if (i == arr.length - 1)
            return;
        if (j < arr.length)
            if (arr[j] < arr[minIdx])
                SelectionSortHelper(arr, i, j + 1, j);
        swap(arr, minIdx, i);
        SelectionSortHelper(arr, i + 1, i + 2, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 29, 27, 5, 29, 19, 22, 250, 750, 2 };
        DoSelectionSortRecursively(arr);
        System.out.println(Arrays.toString(arr));
    }
}