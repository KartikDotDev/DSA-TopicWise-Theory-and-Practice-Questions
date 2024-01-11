package Searching;

/**
 * Binary
 */
public class Binary {

    static int DoBinarySearchIteratively(int[] arr, int key) {
        int right = 0;
        int left = arr.length -1;
        while(right < left) {
            int mid = (right + left) /2;
            if(key > arr[mid]) right = mid + 1;
            else if (key == arr[mid]) return mid;
            else left = mid; 
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
    }
}