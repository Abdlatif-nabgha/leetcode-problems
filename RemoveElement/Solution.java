package RemoveElement;
class Solution {
    // LeetCode Problem 27: Remove Element
    public int removeElement(int[] nums, int val) {
        // Two-pointer approach
        int k = 0; // pointer for the next position to place non-val element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = { 3, 2, 2, 3 };
        int val1 = 3;
        System.out.println("Test Case 1:");
        System.out.print("Original array: ");
        printArray(nums1);
        int result1 = solution.removeElement(nums1, val1);
        System.out.print("Array after removing " + val1 + ": ");
        printArray(nums1, result1);
        System.out.println("Length: " + result1);

        // Test Case 2
        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        System.out.println("\nTest Case 2:");
        System.out.print("Original array: ");
        printArray(nums2);
        int result2 = solution.removeElement(nums2, val2);
        System.out.print("Array after removing " + val2 + ": ");
        printArray(nums2, result2);
        System.out.println("Length: " + result2);
    }

    // Helper method to print array
    private static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper method to print array up to k elements
    private static void printArray(int[] nums, int k) {
        System.out.print("[");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}