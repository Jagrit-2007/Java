package BinarySearch;

public class MatrixSearch {

    public static int[] searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = (rows * cols) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents potential integer overflow

            // Map virtual 1D index back to 2D coordinates
            int r = mid / cols;
            int c = mid % cols;

            int midVal = matrix[r][c];

            if (midVal == target) {
                return new int[]{r, c};
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null; // Target not present in matrix
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;
        int[] result = searchMatrix(matrix, target);

        if (result != null) {
            System.out.println("Target " + target + " found at [row " + result[0] + ", col " + result[1] + "]");
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}