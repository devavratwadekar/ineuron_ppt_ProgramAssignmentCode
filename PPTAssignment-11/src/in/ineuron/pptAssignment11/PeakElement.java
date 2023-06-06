package in.ineuron.pptAssignment11;

public class PeakElement {
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] < nums[mid + 1]) {
                // The peak is on the right side
                left = mid + 1;
            } else {
                // The peak is on the left side, or mid is the peak
                right = mid;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        System.out.println(peakIndex);
    }
}
