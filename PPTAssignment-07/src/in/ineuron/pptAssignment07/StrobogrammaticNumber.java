package in.ineuron.pptAssignment07;

public class StrobogrammaticNumber {
	public boolean isStrobogrammatic(String num) {
		int left = 0;
		int right = num.length() - 1;

		while (left <= right) {
			if (!isStrobogrammaticPair(num.charAt(left), num.charAt(right))) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

	private boolean isStrobogrammaticPair(char c1, char c2) {
		return (c1 == '0' && c2 == '0') || (c1 == '1' && c2 == '1') || (c1 == '8' && c2 == '8')
				|| (c1 == '6' && c2 == '9') || (c1 == '9' && c2 == '6');
	}

	public static void main(String[] args) {
		StrobogrammaticNumber strobogrammaticNumber = new StrobogrammaticNumber();

		String num1 = "69";
		System.out.println(num1 + " is strobogrammatic: " + strobogrammaticNumber.isStrobogrammatic(num1));

		String num2 = "88";
		System.out.println(num2 + " is strobogrammatic: " + strobogrammaticNumber.isStrobogrammatic(num2));

		String num3 = "818";
		System.out.println(num3 + " is strobogrammatic: " + strobogrammaticNumber.isStrobogrammatic(num3));

		String num4 = "123";
		System.out.println(num4 + " is strobogrammatic: " + strobogrammaticNumber.isStrobogrammatic(num4));
	}
}
