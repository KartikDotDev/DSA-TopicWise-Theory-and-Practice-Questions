package MathematicalProblems;

public class Armstrong {

    static boolean isArmstrong(int num) {
        int size = (int)Math.log10(num)+1;
        int result = 0;
        int copy = num;
        while(copy != 0) {
            result += Math.pow(copy%10, size);
            copy/=10;
        }
        return (result == num);

    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    
}
