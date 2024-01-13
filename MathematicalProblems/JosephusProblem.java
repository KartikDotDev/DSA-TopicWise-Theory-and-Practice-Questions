package MathematicalProblems;


public class JosephusProblem {

    static int lastSurvivorPosition(int N, int K) {
        int i = 1, ans = 0;

        while(i < N + 1) {
            ans = (ans + K) %i;
            i++;
        }
        return ans + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(lastSurvivorPosition(5, 2));
    }
}
