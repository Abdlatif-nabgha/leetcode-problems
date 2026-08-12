class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int length = arr.length;
        int[] res = new int[length];
        
        int coef = 1;
        
        for (int i = 0; i < length; i++) {
            res[i] = coef;
            coef *= arr[i];
        }
        
        // loop backward 
        coef = 1;
        for (int i = length - 1; i >= 0; i--) {
            res[i] *= coef;
            coef *= arr[i];
        }
        
        return res;
    }
}
