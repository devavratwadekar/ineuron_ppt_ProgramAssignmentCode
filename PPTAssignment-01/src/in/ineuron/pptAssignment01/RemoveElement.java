package in.ineuron.pptAssignment01;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
		// Create a pointer to keep track of the next available index in the array.
		int count = 0;

		// Iterate over the array, and for each element, check if it is equal to val.
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				// If the element is not equal to val, copy it to the next available index in
				// the array.
				nums[count] = nums[i];
				count++;
			}
		}

		// Return the number of elements in nums which are not equal to val.
		return count;
	}

}
