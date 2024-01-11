package BasicSortingAlgos;

import java.util.Arrays;

/**
 * InsertionSort
 */
public class InsertionSort {
    static void DoInsertionSortIteratively(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i -1;
            while (j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = temp;
        }

    }

    static void DoInsertionSortRecursively(int[] arr) {
        InsertionSortHelper(arr, 1, 0, arr[1]);
    }

    private static void InsertionSortHelper(int[] arr, int i, int j, int temp) {
        if(i == arr.length) return;
        if(j >= 0 && temp < arr[j]) {
            arr[j+1] = arr[j];
            InsertionSortHelper(arr, i, j-1, temp);
        } 
        arr[j+1] = temp;
        InsertionSortHelper(arr, i+1, i, (i < arr.length-1) ? arr[i+1] : 0);
    }


    public static void main(String[] args) {
        int[] arr = {7, 29, 27, 5, 29, 19, 22, 250, 750, 2};
        DoInsertionSortRecursively(arr);
        System.out.println(Arrays.toString(arr));
    }
}