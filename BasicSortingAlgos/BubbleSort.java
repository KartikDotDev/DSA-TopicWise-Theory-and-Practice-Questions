package BasicSortingAlgos;

import java.util.Arrays;

/**
 * BubbleSort
 */
public class BubbleSort {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void DoBubbleSortIteratively(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length; j++)
                if (arr[i] > arr[j])
                    swap(arr, i, j);
    }
    
    static void DoBubbleSortRecursively(int[] arr) {
        BubbleSortHelper(arr, 0, 1);
    }

    static void BubbleSortHelper(int[] arr, int i, int j) {
        if(i == arr.length) return;
        if(j < arr.length) {
            if(arr[i] > arr[j]) swap(arr, i, j);
            BubbleSortHelper(arr, i, j+1);
        }
        else BubbleSortHelper(arr, i+1, i+2);
    }

    

    public static void main(String[] args) {
        int[] arr = {7, 29, 27, 5, 29, 19, 22, 250, 750, 2};
        DoBubbleSortRecursively(arr);
        System.out.println(Arrays.toString(arr));
    }

}