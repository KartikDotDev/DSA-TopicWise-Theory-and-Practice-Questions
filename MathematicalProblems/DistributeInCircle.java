package MathematicalProblems;

/**
 * DistributeInCircle
 * 
 * GFG link-: https://www.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
 * M items are to be delivered in a circle of size N. 
 * Find the position where the M-th item will be delivered if we start from a given position K. 
 * Note that items are distributed at adjacent positions starting from K.
 */
public class DistributeInCircle {

    static int findPosition(int N , int M , int K) {
        // code here
        return (M+K-2) % N + 1;
    }

    public static void main(String[] args) {

    }
}