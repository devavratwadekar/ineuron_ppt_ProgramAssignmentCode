package in.ineuron.pptAssignment11;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Initialize the result with n because n is missing from the array
        int missing = n;
        
        // XOR all the numbers from 0 to n and the numbers in the array
        for (int i = 0; i < n; i++) {
            missing ^= i;
            missing ^= nums[i];
        }
        
        return missing;
    }
    
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
    }
}

