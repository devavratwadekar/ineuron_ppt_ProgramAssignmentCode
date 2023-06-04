package in.ineuron.pptAssignment09;

public class SumOfFirstNNumbers {
	public static int sumOfFirstNNumbers(int n) {
		return (n * (n + 1)) / 2;
	}

	public static void main(String[] args) {
		int n = 3;
		int sum = sumOfFirstNNumbers(n);
		System.out.println(sum);
	}
}
