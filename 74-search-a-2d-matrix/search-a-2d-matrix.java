class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m = matrix[0].length; // number of column
        int n = matrix.length; // number of row

        Integer targetRow = null;

        int left = 0, right = n-1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // check if target in that range row
            if (matrix[mid][0] <= target && target <= matrix[mid][m-1]) {
                targetRow = mid;
                break;
            }
            else if (matrix[mid][0] > target) right = mid-1;
            else left = mid+1;
        }
        if (targetRow == null) return false;

        left = 0;
        right = m-1;

        while (left <= right)  {
            int mid = (left + right) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            }
            else if (matrix[targetRow][mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}