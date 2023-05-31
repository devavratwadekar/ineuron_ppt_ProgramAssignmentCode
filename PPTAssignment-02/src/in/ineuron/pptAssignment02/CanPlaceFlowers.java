package in.ineuron.pptAssignment02;

//TC=O(n) & SC=O(n)
/**
 * 
 * @author DEVAVRAT
 *
 */
public class CanPlaceFlowers {

	public static void main(String[] args) {

		int[] flowerbed = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println("Can Place Flowers :: " + canPlaceFlowers(flowerbed, n));

	}

	private static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;

		for (int i = 0; i < flowerbed.length; i++) {

			if (flowerbed[i] == 0) {
				int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
				int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;

				if (prev == 0 && next == 0) {
					flowerbed[i] = 1;
					count++;
				}
			}
			if (count >= n) {
				return true;
			}
		}
		return false;
	}
}
