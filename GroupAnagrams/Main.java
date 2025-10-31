package GroupAnagrams;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Example 1
        String[] strs1 = { "act", "pots", "tops", "cat", "stop", "hat" };
        List<List<String>> result1 = solution.groupAnagrams(strs1);
        System.out.println("Example 1:");
        System.out.println("Input: " + Arrays.toString(strs1));
        System.out.println("Output: " + result1);
        System.out.println();

        // Example 2
        String[] strs2 = { "x" };
        List<List<String>> result2 = solution.groupAnagrams(strs2);
        System.out.println("Example 2:");
        System.out.println("Input: " + Arrays.toString(strs2));
        System.out.println("Output: " + result2);
        System.out.println();

        // Example 3
        String[] strs3 = { "" };
        List<List<String>> result3 = solution.groupAnagrams(strs3);
        System.out.println("Example 3:");
        System.out.println("Input: " + Arrays.toString(strs3));
        System.out.println("Output: " + result3);
        System.out.println();

        // Additional test
        String[] strs4 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> result4 = solution.groupAnagrams(strs4);
        System.out.println("Additional Example:");
        System.out.println("Input: " + Arrays.toString(strs4));
        System.out.println("Output: " + result4);
    }
}
