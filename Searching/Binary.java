package Searching;

import java.util.Arrays;

/**
 * Binary
 */
public class Binary {

    static int DoBinarySearchIteratively(int[] arr, int key) {
        int right = 0;
        int left = arr.length -1;
        while(right <= left) {
            int mid = (right + left) /2;
            if(key > arr[mid]) right = mid + 1;
            else if (key == arr[mid]) return mid;
            else left = mid; 
        }
        return -1;
    }
    
    static int DoLinearSearchRecursively(int[] arr, int key) {
        return BinarySearchHelper(arr, key, 0, arr.length-1);
    }

    static int BinarySearchHelper(int[] arr, int key, int right, int left) {
        if(right > left) return -1;
        int mid = (right + left)/2;
        if(key > arr[mid]) return BinarySearchHelper(arr, key, mid+1, left);
        else if(key == arr[mid]) return mid;
        else return BinarySearchHelper(arr, key, right, mid);
    }
    public static void main(String[] args) {
        int[] arr = { 7, 29, 27, 5, 19, 22, 250, 750, 2 };
        Arrays.sort(arr);
        System.out.println(DoBinarySearchIteratively(arr, 29));
        System.out.println(DoLinearSearchRecursively(arr, 29));
    }
}