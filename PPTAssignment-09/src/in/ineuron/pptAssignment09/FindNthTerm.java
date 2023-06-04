package in.ineuron.pptAssignment09;

public class FindNthTerm {
    public static int findNthTerm(int a, int d, int N) {
        return a + (N - 1) * d;
    }
    
    public static void main(String[] args) {
        int a = 2;
        int d = 1;
        int N = 5;
        int nthTerm = findNthTerm(a, d, N);
        System.out.println("The " + N + "th term of the series is: " + nthTerm);
    }
}

