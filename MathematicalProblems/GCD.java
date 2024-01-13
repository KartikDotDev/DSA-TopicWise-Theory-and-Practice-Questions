package MathematicalProblems;

/**
 * GCD
 */
public class GCD {

    static int CalculateGCD(int a, int b) {
        if(a == 0) return b;
        return CalculateGCD(b%a, a);
    }

    public static void main(String[] args) {
        System.out.println(CalculateGCD(3, 9));
    }
    
}