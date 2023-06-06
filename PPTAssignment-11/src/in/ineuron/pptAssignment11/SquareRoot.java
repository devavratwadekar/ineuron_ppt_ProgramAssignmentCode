package in.ineuron.pptAssignment11;

public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1;
        long right = x;
        long result = 0;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid <= x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) result;
    }
    
    public static void main(String[] args) {
        int x = 4;
        int sqrtValue = sqrt(x);
        System.out.println(sqrtValue);
    }
}
