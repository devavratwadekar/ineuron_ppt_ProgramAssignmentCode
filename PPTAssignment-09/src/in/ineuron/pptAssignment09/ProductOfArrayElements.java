package in.ineuron.pptAssignment09;

public class ProductOfArrayElements {
	public static long getProductOfArrayElements(int[] arr) {
		long product = 1;
		for (int num : arr) {
			product *= num;
		}
		return product;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		long product = getProductOfArrayElements(arr);
		System.out.println(product);
	}
}
