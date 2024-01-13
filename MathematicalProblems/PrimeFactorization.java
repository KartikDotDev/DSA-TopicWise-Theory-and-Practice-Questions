package MathematicalProblems;

/**
 * PrimeFactorization
 */
public class PrimeFactorization {

    static boolean isPrime(int a) {
        for(int i = 2; i*i < a+1; i++) {
            if(a % i == 0) return false;
        }
        return true;
    }

    /**
     * 
     * @param a stands for the number whose prime factors we're gonna print.
     * 
     * T-> O(n^(3/2))
     * Naive Method
     */
    static void PrintAllPrimeFactors(int a) {
        int num = a;
        for(int i = 2; i < a/2; i++) {
            while (isPrime(i) && num % i ==0) {
                System.out.print(i + " ");
                num/=i;
            }
        }
    }
    /**
     * 
     * @param a denotes the number whose prime factorization needs to be printed
     * 
     * T-> O()
     */

    static void PrintAllPrimeFactorsQuick(int a) {
        while (a % 2 == 0) {
            System.out.print(2 + " ");
            a/=2;
        }

        for(int i = 3; i*i < a+1; i+=2) {
            while(a%i == 0) {
                System.out.print(i + " ");
                a/=i;
            }
        }
    }

    public static void main(String[] args) {
        PrintAllPrimeFactors(169);
        System.out.println();
        PrintAllPrimeFactorsQuick(169);
    }
}