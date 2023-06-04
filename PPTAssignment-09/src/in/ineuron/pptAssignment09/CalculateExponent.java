package in.ineuron.pptAssignment09;

public class CalculateExponent {
	public static double calculateExponent(int N, int P) {
		return Math.pow(N, P);
	}

	public static void main(String[] args) {
		int N = 5;
		int P = 2;
		double result = calculateExponent(N, P);
		System.out.println(result);
	}
}
