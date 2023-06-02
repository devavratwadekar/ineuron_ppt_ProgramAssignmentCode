package in.ineuron.pptAssignment05;

public class Staircase {
    public int countCompleteRows(int n) {
        int left = 1; // Starting with the first row
        int right = n; // Initially, the last row can be the complete row

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int totalCoins = (mid * (mid + 1)) / 2;

            if (totalCoins == n)
                return mid; // Found a complete row

            if (totalCoins > n)
                right = mid - 1; // The current row is incomplete, check left side
            else
                left = mid + 1; // The current row is complete, check right side
        }

        return right; // Return the last complete row found
    }

    public static void main(String[] args) {
        Staircase staircase = new Staircase();
        int n = 5;
        int completeRows = staircase.countCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
