package Searching;

/**
 * Linear
 */
public class Linear {

    static int DoLinearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }

    static int DoLinearSearchRecursively(int[] arr, int key) {
        return LinearSearchHelper(arr, key, 0);
    }

    static int LinearSearchHelper(int[] arr, int key , int i) {
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;
        return LinearSearchHelper(arr, key, i+1);
    }


    public static void main(String[] args) {
        int[] arr = { 7, 29, 27, 5, 29, 19, 22, 250, 750, 2 };
        System.out.println(DoLinearSearch(arr, 29));
        System.out.println(DoLinearSearchRecursively(arr, 29));
    }
}